package com.dil8654.serialization;

import java.io.IOException;

public class SerializationTest {

	
	public static void main(String[] args) 
	{
		
		Student std = new Student();
		std.setId(100);
		std.setName("Dilanka");
		std.setAge(12);
		
		//serialize to a file
		
		String fileName="student.ser";  // files will be saved in classpath
		
		try {
			SerUtility.serializeObject(std, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		Student deserielized = null;
		try {
			deserielized = (Student) SerUtility.deserializeObject(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Serielized Student Object:"+std);
		System.out.println("Deserielized Student Object:"+deserielized);
	}


}
