package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructDITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
		TextEditor te = (TextEditor) context.getBean("te");
		System.out.println("使用构造函数：");
		te.spellCheck();
		System.out.println("使用setter注入: ");
		TextEditor te2 = (TextEditor) context.getBean("te2");
		te2.spellCheck();
		System.out.println("使用内部Bean注入: ");
		TextEditor te3 = (TextEditor) context.getBean("te3");
		te3.spellCheck();
	}

}
