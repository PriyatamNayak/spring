package co.edureka.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.model.User;

public class TestClass {
	public static void main(String[] args) {
		//initialize spring container
		//BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user1 = (User)context.getBean("user1");
		System.out.println(user1); //toString()
		System.out.println(user1.getFirstName()+" "+user1.getLastName());
		
		User user2 = context.getBean("user2", User.class);
		System.out.println(user2);
		
		User user3 = (User)context.getBean("user3");
		System.out.println(user3);
		
		User user4 = (User)context.getBean("user4");
		System.out.println(user4);				
	}
}
