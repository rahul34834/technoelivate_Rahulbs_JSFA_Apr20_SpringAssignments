package com.te.springcoreannotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcoreannotations1.beans.EmployeeBean;
import com.te.springcoreannotations1.configurations.EmployyeConfig;

public class EmployeTest {
	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(EmployyeConfig.class);
		EmployeeBean bean =context.getBean(EmployeeBean.class);
		
		System.out.println("Before init " +bean);
		
		bean.setEid(10);
		bean.setEname("rahul");
		
		System.out.println("After init " +bean);
		
	}

}
