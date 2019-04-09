package com.springioc.beanInheritance.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springioc.beanInheritance.beans.Child;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		Child child = (Child)context.getBean("child");
		System.out.println(child.getFirstName());
		System.out.println(child.getLastName());
	}

}
