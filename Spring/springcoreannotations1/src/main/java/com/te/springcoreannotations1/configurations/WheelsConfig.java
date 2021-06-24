package com.te.springcoreannotations1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations1.beans.Car;
import com.te.springcoreannotations1.beans.Engine;
import com.te.springcoreannotations1.beans.Wheels;


@Configuration

public class WheelsConfig {
	
	@Bean(name="mrf")
	public Wheels getWheel() {
		
		return new Wheels("MRF",19);
		
	}
	@Bean(name="ceat")
    public Wheels getWheels() {
		
		return new Wheels("CEAT",15);
		
	}  
	@Bean
	public Car getCar() {
		return new Car(new Engine(),new Wheels());
		
	}
	

}
