package com.te.animal;

import com.te.animal.interfaces.Animal;

public class Hippo implements Animal{

	@Override
	public void eat() {
		System.out.println(" Hippo is Eating  crcodiles");
		
	}

	@Override
	public void speak() {
		System.out.println("Barking.....");
		
	}

}
