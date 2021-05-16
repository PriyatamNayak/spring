package co.edureka.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Hospital hosp = (Hospital)context.getBean("hospital1");
		System.out.println(hosp.getHospitalName());
		System.out.println(hosp.getDepartments());
		System.out.println(hosp.getDepartments().getClass());
	}

}
