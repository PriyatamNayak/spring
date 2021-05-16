package co.edureka;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.spring.core.beans.User;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        
        User user = (User)context.getBean("user");
        
        System.out.println(user.getFirstName()+" "+user.getLastName()+" owns an "+ 
        					user.getCar().getModel()+" car , which costs Rs."+user.getCar().getCost());       
        
     }
}
