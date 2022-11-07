package com.skj.demo.main;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.skj.demo.entity.Kid;

	public class MainClass {

		public static void main(String[] args) {
		
			ApplicationContext spring = new ClassPathXmlApplicationContext("kid-spring-conf.xml");
			
			Kid k1= spring.getBean("kid",Kid.class);
			System.out.println(k1);
			System.out.println(k1.getName());
			System.out.println(k1.getParent());
			
			System.out.println(" parent Name "+k1.getParent().getFatherName());
			
		}
	}

