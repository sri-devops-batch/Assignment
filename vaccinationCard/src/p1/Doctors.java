package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Doctors {
	private String dName;
	private String qualification;
	private String profession;
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctors(String dName, String qualification, String profession) {
		super();
		this.dName = dName;
		this.qualification = qualification;
		this.profession = profession;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
	
}
