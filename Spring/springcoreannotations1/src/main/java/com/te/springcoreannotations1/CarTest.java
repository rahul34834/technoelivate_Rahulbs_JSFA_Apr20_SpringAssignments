package com.te.springcoreannotations1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotations1.beans.Car;
import com.te.springcoreannotations1.configurations.CarConfig;

public class CarTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
		
		Car car1=context.getBean(Car.class);
		System.out.println(car1.getEngine().getCc());
		System.out.println(car1.getEngine().getTypeofengine());
		
		
		System.out.println("---------------------");
		
		System.out.println(car1.getWheel().getName());
		System.out.println(car1.getWheel().getSize());
	}

}
