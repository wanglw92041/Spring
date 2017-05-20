package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProfileTest {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("profile.xml");
		Profile profile = (Profile) context.getBean("profile");
		profile.printName();
		profile.printAge();

		HelloWorld obj = (HelloWorld) context.getBean("hello");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
