package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BynameTypeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
		TextEditor te = (TextEditor) context.getBean("te");
		te.spellCheck();
		
		TextEditor te2 = (TextEditor) context.getBean("te2");
		te2.spellCheck();
		
		TextEditor te3 = (TextEditor) context.getBean("te3");
		te3.spellCheck();
	}

}
