package co.edureka.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.collections.beans.Invoice;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Invoice invoice = (Invoice)context.getBean("INV101");
		System.out.println("Invoice No: " + invoice.getInvoiceNo());
		System.out.println("Customer : "+ invoice.getCustomerName());
		System.out.println("Items : " + invoice.getItems());
		System.out.println("Type of Items = "+ invoice.getItems().getClass());
	}
}
