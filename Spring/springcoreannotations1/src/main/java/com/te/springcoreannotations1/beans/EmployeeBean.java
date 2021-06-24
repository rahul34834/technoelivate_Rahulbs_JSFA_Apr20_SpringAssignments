package com.te.springcoreannotations1.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data


public class EmployeeBean implements Serializable {
	
	private int eid;
	private String ename;
	
	
	

}
