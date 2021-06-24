package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;

import lombok.Data;

@Data
@AllArgsConstructor
public class Employee  implements Serializable{
	
	private int id;
	private String name;
	
	public Employee() {
		
	}
	
	
	

}
