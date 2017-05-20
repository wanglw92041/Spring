package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		Student student = (Student) context.getBean("stu");
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}

}
