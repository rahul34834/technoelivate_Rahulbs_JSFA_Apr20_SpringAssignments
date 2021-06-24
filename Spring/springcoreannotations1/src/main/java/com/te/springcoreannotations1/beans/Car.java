package com.te.springcoreannotations1.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Component

public class Car  implements Serializable{
	
	private Engine engine;
	private Wheels wheel;
	
	@Autowired
	public Car(Engine engine, @Qualifier("mrf") Wheels wheel) {
		super();
		this.engine = engine;
		this.wheel = wheel;
	}
	
	

}
