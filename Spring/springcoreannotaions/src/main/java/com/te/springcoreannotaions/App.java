package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoreannotaions.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("employe.xml");
        
       Employee emp1= context.getBean("emp",Employee.class);
       
       emp1.setId(10);
       emp1.setName("rahul");
        
        
    }
}
