package com.te.animal.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.animal.Hippo;
import com.te.animal.Panda;
import com.te.animal.interfaces.Animal;

@Configuration

public class AnimalConfig {
	
	@Bean("panda")
	
	public Animal getPanda() {
		return new Panda();	
		
	}
	
	@Bean("hippo")
	
	public Animal  getHippo() {
		return new Hippo();
		
	}

}
