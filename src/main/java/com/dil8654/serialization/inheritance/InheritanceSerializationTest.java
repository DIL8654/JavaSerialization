package com.dil8654.serialization.inheritance;

import java.io.IOException;

import com.dil8654.serialization.SerUtility;

public class InheritanceSerializationTest {

	public static void main(String[] args) {
		String fileName = "subclass.ser";

		SubClass subClass = new SubClass();
		subClass.setId(10);
		subClass.setValue("Data");
		subClass.setName("Dilanka");

		try {
			SerUtility.serializeObject(subClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		try {
			SubClass subclass = (SubClass) SerUtility.deserializeObject(fileName);
			System.out.println("SubClass read = " + subclass);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}

}
