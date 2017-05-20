package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		TextEditor te=(TextEditor) context.getBean("te");
		te.spellCheck();
	}

}
