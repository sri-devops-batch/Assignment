package p1;


import java.time.LocalDate;
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
import javax.persistence.Table;

@Entity
@Table(name="Kid")
public class Kid {
	@Id
	private int id;
	private String dob;
	@Column(name="Kid_Name")
	private String Name;
	private String gender;
	private int weight;
	
	@Embedded
	private Parent ParentInfo;
	
	@Embedded
	@AttributeOverrides({
	            @AttributeOverride(name="fatherName",column=@Column(name="grandFather")),
	             @AttributeOverride(name="motherName",column=@Column(name="grandamother")),
	             @AttributeOverride(name="phoneNo",column=@Column(name="phoneNo")),
	})
	
	@ElementCollection
	@CollectionTable(name = "KidVaccination")
	private List<Vaccination>allVaccination;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "HospitalInfo")
	private Hospital HospitalInfo;
	
	
	public Kid() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kid(String dob, String name, String gender, int weight) {
		super();
		this.dob = dob;
		Name = name;
		this.gender = gender;
		this.weight = weight;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Parent getParentInfo() {
		return ParentInfo;
	}
	public void setParentInfo(Parent parentInfo) {
		ParentInfo = parentInfo;
	}
	public List<Vaccination> getAllVaccination() {
		return allVaccination;
	}
	public void setAllVaccination(List<Vaccination> allVaccination) {
		this.allVaccination = allVaccination;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Kid [id=" + id + ", dob=" + dob + ", Name=" + Name + ", gender=" + gender + ", weight=" + weight
				+ ", ParentInfo=" + ParentInfo + ", allVaccination=" + allVaccination + "]";
	}
	
	}