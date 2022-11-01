package com.skj.gtest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skj.gtest.dao.StudentUserDAO;
import com.skj.gtest.entity.Student;
@Service
public class StudentUserServiceImpl implements StudentUserService {
	   @Autowired
	    StudentUserDAO studentDao;

	@Override
	public List<Student> getAllStudents()  throws Exception  {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	@Override
	public List<Student> getAllStudentsByStream() throws Exception {
		// TODO Auto-generated method stub
		return studentDao.getAllStudentsByStream();
	}

	@Override
	public List<Student> getAllStudentsByMarks(int r1, int r2)  throws Exception{
		// TODO Auto-generated method stub
		return studentDao.getAllStudentsByMarks(r1, r2);
	}

	@Override
	public Student getStudentByName(String Name)throws Exception {
		// TODO Auto-generated method stub
		return studentDao.getStudentByName(Name);
	}

	@Override
	public Student getStudentByRollNumber(int rollNum)  throws Exception{
		// TODO Auto-generated method stub
		return studentDao.getStudentByRollNumber(rollNum);
	}

}