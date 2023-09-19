package com.jspiders.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcore.bean.StudentBean1;

public class StudentMain1 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		StudentBean1 student1 = context.getBean(StudentBean1.class);
		
		System.out.println(student1);
		
		((ClassPathXmlApplicationContext)context).close();	
	}

}
