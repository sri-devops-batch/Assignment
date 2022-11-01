package com.skj.gtest.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.skj.gtest.entity.Student;
@Component
public class StudentDatabase {
	

	public List<Student> allStudents = new ArrayList<>();
	public List<Student> getStudentByStream = new ArrayList<>();
	public List<Student> getAllStudentsByMarks=new ArrayList<>();

	 StudentDatabase() {

		 System.out.println(" inside Student database");
		 
		 Student s1= new Student("Deva", 101, 504, "Bsc");
		 Student s2= new Student("Rani", 102, 489, "BBA");
		 Student s3= new Student("Thanu", 103, 600, "Bcom");
		 
		 allStudents.add(s1);
		 allStudents.add(s2);
		 allStudents.add(s3);
		 
		 Student s4= new Student(null, 0, 0, "python");
		 Student s5= new Student(null, 0, 0, "DevOps");
		 Student s6= new Student(null, 0, 0, "java");
		 getStudentByStream.add(s4);
		 getStudentByStream.add(s5);
		 getStudentByStream.add(s6);
		 
		 Student s7= new Student(null, 0, 600, null);
		 Student s8= new Student(null, 0, 500, null);
		 Student s9= new Student(null, 0, 400, null);
		 getAllStudentsByMarks.add(s7);
		 getAllStudentsByMarks.add(s8);
		 getAllStudentsByMarks.add(s9);
		 
		 
		 
		 
	 }


	public List<Student> getAllStudents() {
		return allStudents;
	}


	public void setAllStudents(List<Student> allStudents) {
		this.allStudents = allStudents;
	}


	public List<Student> getGetStudentByStream() {
		return getStudentByStream;
	}


	public void setGetStudentByStream(List<Student> getStudentByStream) {
		this.getStudentByStream = getStudentByStream;
	}


	public List<Student> getGetAllStudentsByMarks() {
		return getAllStudentsByMarks;
	}


	public void setGetAllStudentsByMarks(List<Student> getAllStudentsByMarks) {
		this.getAllStudentsByMarks = getAllStudentsByMarks;
	}




}