package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans1.xml");	
		HelloWorld obj = (HelloWorld) context.getBean("he");
		obj.setMessage("aaa");
		obj.getMessage();
		HelloWorld a=(HelloWorld)context.getBean("he");
		a.getMessage();
		HelloWorld b=(HelloWorld)context.getBean("s");
		b.setMessage("啊啊啊");
		b.getMessage();
		HelloWorld c=(HelloWorld)context.getBean("s");
		c.getMessage();
		HelloWorld d=(HelloWorld)context.getBean("hello");
		d.getMessage();
		context.registerShutdownHook();
	}
}
