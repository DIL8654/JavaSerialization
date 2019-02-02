package com.dil8654.serialization;

import java.io.IOException;

public class DeserializationTest {

	public static void main(String[] args) {

		Student student = null;

		String fileName = "student.ser"; // file name which already saved in classpath
		
		try {
			student = (Student) SerUtility.deserializeObject(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

		System.out.println("new Student Object which added a new surName field::" + student);

	}

}
