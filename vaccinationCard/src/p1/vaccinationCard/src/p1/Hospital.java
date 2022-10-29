package p1;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Hospital {
	@Id
	private int hId;
	@Column(name="Hospital_Name")
	private String hname;
	private int registrationNumber;
	
	
	
    @Embedded
	private Doctors DoctorsInfo;
    
    
    @Embedded
    @AttributeOverrides({
    	@AttributeOverride(name = "DoctorName",column = @Column(name = "doctorname")),
    	@AttributeOverride(name = "DoctorQualification",column = @Column(name = "Qualification")),
    	@AttributeOverride(name = "DoctorProfession",column = @Column(name = "Profession")),
    })
    
	@ElementCollection
	@CollectionTable(name = "DoctorsList")
	private List<Doctors>allDoctors;
    
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HospitalInfo")
	private Hospital HospitalInfo;
	
	
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(int hId, String hname, int registrationNumber) {
		super();
		this.hId = hId;
		this.hname = hname;
		this.registrationNumber = registrationNumber;
	}

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Doctors getDoctorsInfo() {
		return DoctorsInfo;
	}

	public void setDoctorsInfo(Doctors doctorsInfo) {
		DoctorsInfo = doctorsInfo;
	}

	public List<Doctors> getAllDoctors() {
		return allDoctors;
	}

	public void setAllDoctors(List<Doctors> allDoctors) {
		this.allDoctors = allDoctors;
	}

	public Hospital getHospitalInfo() {
		return HospitalInfo;
	}

	public void setHospitalInfo(Hospital hospitalInfo) {
		HospitalInfo = hospitalInfo;
	}
}