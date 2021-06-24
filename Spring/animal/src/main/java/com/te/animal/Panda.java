package com.te.animal;

import com.te.animal.interfaces.Animal;

public class Panda  implements  Animal {

	@Override
	public void eat() {
		System.out.println("Panda is eating Bambbos");
		
	}

	@Override
	public void speak() {
		System.out.println("hufing....");
		
	}
	

}
