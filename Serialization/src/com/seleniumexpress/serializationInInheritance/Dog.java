package com.seleniumexpress.serializationInInheritance;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Integer iNo2 = 200;

	public Dog() {
		System.out.println("Inside Dog Constructor");
	}

}
