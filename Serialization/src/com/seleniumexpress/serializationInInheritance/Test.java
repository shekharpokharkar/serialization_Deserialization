package com.seleniumexpress.serializationInInheritance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Dog d = new Dog();
		d.iNo1 = 999;
		d.iNo2 = 888;

		FileOutputStream fos = new FileOutputStream("shekhar.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println("Serialization completed");
		FileInputStream fios = new FileInputStream("shekhar.txt");
		ObjectInputStream ios = new ObjectInputStream(fios);
		Dog d1 = (Dog) ios.readObject();
		System.out.println("iNo1:" + d1.iNo1 + "==" + "iNo2:" + d1.iNo2);
	}

}
