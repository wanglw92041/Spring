package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Beans2Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		Hello1 h1 = (Hello1) context.getBean("h1");
		h1.getMessage1();
		h1.getMessage2();

		Hello2 h2 = (Hello2) context.getBean("h2");
		h2.getMessage1();
		h2.getMessage2();
		h2.getMessage3();

		Hello2 h3 = (Hello2) context.getBean("h3");
		h3.getMessage1();
		h3.getMessage2();
		h3.getMessage3();
	}

}
