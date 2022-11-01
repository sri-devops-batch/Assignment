package com.skj.gtest.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skj.gtest.entity.Student;
import com.skj.gtest.service.StudentUserService;

@RestController
@RequestMapping("/college")
public class MyWebController {

	@Autowired
	StudentUserService studentService;
	
	@GetMapping("/student/{rollnum}")
	public Student abc1(@PathVariable int rollnum)throws Exception
	{
		return studentService.getStudentByRollNumber(rollnum);
	}
	
	
	
	@GetMapping("/student/{searchname}")
	public Student abc2(@PathVariable String searchname)throws Exception
	{
		return studentService.getStudentByName(searchname);
		
	}

	@GetMapping("/students")
	public List<Student> getAllStudents()
	{
		// write some code to extract users
		try {
			List<Student>  allExtractedStudents = studentService.getAllStudents();
			
			return allExtractedStudents;
			
		} catch (Exception e) {
			// code missing for expection handling 
			System.out.println(e);
			
		}
		return null;
		
		
	}

		
		
	}