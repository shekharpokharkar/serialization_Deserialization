package com.seleniumexpress;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final String studentSchoolName = "Mahatma Gandhi Vidyalaya Manchar";
	private Integer studentId;
	private String studentName;
	private String studentCity;
	
	private static Integer schoolIdNumber = 5001;
	private transient String studentPassword;

	public Student(Integer studentId, String studentName, String studentCity, String studentPassword) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPassword = studentPassword;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentSchoolName() {
		return studentSchoolName;
	}

	public static Integer getSchoolIdNumber() {
		return schoolIdNumber;
	}

	public static void setSchoolIdNumber(Integer schoolIdNumber) {
		Student.schoolIdNumber = schoolIdNumber;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	@Override
	public String toString() {
		return "Student [studentSchoolName=" + studentSchoolName + ", studentId=" + studentId + ", studentName="
				+ studentName + ", studentCity=" + studentCity + ", studentPassword=" + studentPassword + "]";
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String password = studentPassword + "123";
		System.out.println("Inside writeObject:"+password);
		oos.writeObject(password);
	}

	private void readObject(ObjectInputStream oos) throws Exception {
		oos.defaultReadObject();
		String password = (String) oos.readObject();
		System.out.println("Inside readObject:"+password);
		this.studentPassword = password.substring(0, password.length() - 3);
	}

}
