package com.skj.gtest.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skj.gtest.entity.Student;
@Repository
public class StudentUserDAOImpl  implements StudentUserDAO {
	@Autowired
	StudentDatabase db;
	
	@Override
	public List<Student> getAllStudents() throws Exception {
		// TODO Auto-generated method stub
		return db.getAllStudents();
	}

	@Override
	public List<Student> getAllStudentsByStream() throws Exception {
		// TODO Auto-generated method stub
		return db.getStudentByStream;
	}

	@Override
	public List<Student> getAllStudentsByMarks(int r1, int r2) throws Exception {
		// TODO Auto-generated method stub
		return db.getAllStudentsByMarks;
	}

	@Override
	public Student getStudentByName(String Name) throws Exception {
		List<Student> allStudents = getAllStudents();
		Student s=(Student) allStudents.stream().filter((u)->{
			if(u.getStudentName().equals(Name))
			{
				return true;
			}
			else return false;
		}).findFirst().get();

		return s;
		}
	

	@Override
	public Student getStudentByRollNumber(int rollNum) throws Exception {
		// TODO Auto-generated method stub
		List<Student> allStudents = getAllStudents();
		Student s=(Student) allStudents.stream().filter((u)->{
			if(u.getStudentName().equals(rollNum))
			{
				return true;
			}
			else return false;
		}).findFirst().get();

		return s;
		}
	
		
	}





















