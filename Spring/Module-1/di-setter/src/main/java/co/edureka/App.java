package co.edureka;

import java.util.Scanner;

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
        
        /*
        Scanner sc = new Scanner(System.in);        
        System.out.print("enter new car model: ");
        String newModel = sc.nextLine();
        
        user.getCar().setModel(newModel);
        */
        
        System.out.println(user.getFirstName()+" "+user.getLastName()+" owns an "+ 
				user.getCar().getModel()+" car , which costs Rs."+user.getCar().getCost());
        
        User user1 = (User)context.getBean("user1");
        System.out.println(user1.getFirstName()+" "+user1.getLastName()+" owns an "+ 
				user.getCar().getModel()+" car , which costs Rs."+user.getCar().getCost());
    }
}
