package com.skj.demo.entity;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component  // either we can provide bean name , otherwise class name will be consider as bean name (note :- small letters)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Kid{
	
	@Value("22")
	private int id;
	@Value("Mahesh")
	private String name;
	@Value("${weight}")   // this is how to pick the value from property file
	private int weight;

	@Autowired
	private Parent parent;
	
	public Kid(int id, String name, int weight) {
		super();
		this.id= id;
		this.name = name;
		this.weight= weight;
	}
	
	
}

 








