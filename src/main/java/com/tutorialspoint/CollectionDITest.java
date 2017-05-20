package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansCollection.xml");
		JavaCollection jc = (JavaCollection) context.getBean("javaCollection");
		System.out.println(jc);
	}

}
