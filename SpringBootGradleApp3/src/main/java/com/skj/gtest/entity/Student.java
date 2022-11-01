package com.skj.gtest.entity;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String StudentName;
	private int RollNumber;
	private int Marks;
	private String Stream;
	
	public Student() {
		super();
	}

	public Student(String studentName, int rollNumber, int marks, String stream) {
		super();
		StudentName = studentName;
		RollNumber = rollNumber;
		Marks = marks;
		Stream = stream;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getStream() {
		return Stream;
	}

	public void setStream(String stream) {
		Stream = stream;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", RollNumber=" + RollNumber + ", Marks=" + Marks + ", Stream="
				+ Stream + "]";
	}
	

}