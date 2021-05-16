package co.edureka.spring.core.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.innerbeans.beans.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e = (Employee)context.getBean("emp");		
		System.out.println(e);
		e.setEmpName("Anil Kumar");
		System.out.println(e);
		
		Employee e1 = (Employee)context.getBean("sunil");		
		System.out.println(e1);		
	}
}
