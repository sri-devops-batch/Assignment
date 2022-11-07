package com.skj.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component 
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
	
	@Value("${father.name}")
   private String fatherName;
	@Value("${mother.name}")
   private String motherName;
	@Value("${grandFather.name}")
	private String grandFatherName;
	@Value("${grandMother.name}")
	private String grandmotherName;
	
}

