package com.seleniumexpress.Externalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.seleniumexpress.Student;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File foo = new File("shekhar.txt");
		foo.createNewFile();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(foo));

		Demo d = new Demo(1000, 2000, "shekhar");
		oos.writeObject(d);

		System.out.println("Object serialize successfully");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(foo));
		Demo demo = (Demo) ois.readObject();
		System.out.println(demo);
	}

}
