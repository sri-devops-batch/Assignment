package p1;

import javax.persistence.Embeddable;

@Embeddable
public class Parent {
	
	private String fatherName;
	private  String motherName;
	private long phoneNo;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(String fatherName, String motherName, long phoneNo) {
		super();
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.phoneNo = phoneNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Parent [fatherName=" + fatherName + ", motherName=" + motherName + ", phoneNo=" + phoneNo + "]";
	}
	
}

	