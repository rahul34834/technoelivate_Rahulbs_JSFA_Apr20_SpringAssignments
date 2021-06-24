package com.te.springcoreannotations1.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotations1.beans.Engine;

@Configuration

public class EngineConfig {
	
	@Bean
	public Engine getEngine() {
		return new Engine(800,"v4");
	}
	
	

}
