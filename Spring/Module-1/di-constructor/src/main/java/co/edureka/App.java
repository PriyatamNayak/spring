package co.edureka;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new ClassPathXmlApplicationContext("configs/context.xml");
    	//ApplicationContext context = new ClassPathXmlApplicationContext("co/edureka/context.xml");
    	ApplicationContext context = new FileSystemXmlApplicationContext("E:/Spring/module-1/di-constructor/src/main/java/co/edureka/context.xml");
    	
        User user = (User)context.getBean("user");
        
        System.out.println(user.getFirstName()+" "+user.getLastName()+" owns an "+ 
        					user.getCar().getModel()+" car , which costs Rs."+user.getCar().getCost());
 
    }
}
