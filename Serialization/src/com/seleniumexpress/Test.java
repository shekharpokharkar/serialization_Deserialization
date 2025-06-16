package com.seleniumexpress;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		/*
		 * Student shekhar1 = new Student(1, "shekhar1", "Manchar1", "1234"); Student
		 * shekhar2 = new Student(2, "shekhar2", "Manchar2", "5678"); Student shekhar3 =
		 * new Student(3, "shekhar3", "Manchar3", "9012");
		 * 
		 * Student[] stuArray = new Student[3]; stuArray[0] = shekhar1; stuArray[1] =
		 * shekhar2; stuArray[2] = shekhar3;
		 */
		File foo = new File("shekhar.txt");

		/*
		 * foo.createNewFile(); ObjectOutputStream oos = new ObjectOutputStream(new
		 * FileOutputStream(foo)); oos.writeObject(stuArray);
		 */
		System.out.println("Object serialize successfully");

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(foo));
		Student[] stu = (Student[]) ois.readObject();
		for (Student s : stu) {
			System.out.println(s);
		}

	}

}
