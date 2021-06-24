package com.te.animal.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.te.animal.interfaces.Animal;

import lombok.Data;


@Data

public class Pet  implements Serializable{
	
	private String name;
	@Autowired
	private Animal animal;

}
