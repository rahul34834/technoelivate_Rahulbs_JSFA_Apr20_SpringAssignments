package com.te.springcoreannotations1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations1.beans.EmployeeBean;

@Configuration
public class EmployyeConfig {
	
	@Bean
	public EmployeeBean getEmployeeBean() {
		return new EmployeeBean();
	
	}
	
	

}
