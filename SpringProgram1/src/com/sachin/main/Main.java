package com.sachin.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sachin.Student;

public class Main {

	public static void main(String[] args) {
		
		String config_loc="/com/sachin/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		// for stu class object
		Student stu=(Student)context.getBean("stdId");
		stu.display();
		System.out.println("..............................");
		Student stu1=(Student)context.getBean("stdId1");
		stu1.display();
		
	}
}
