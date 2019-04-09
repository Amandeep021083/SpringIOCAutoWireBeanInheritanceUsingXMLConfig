package com.springioc.beanInheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.beanInheritance.beans.Child2;

public class MainClass2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Child2 child2 = (Child2)context.getBean("child2");
		System.out.println(child2.getFirstName());
		System.out.println(child2.getLastName());
	}

}
