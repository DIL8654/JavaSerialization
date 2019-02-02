package com.dil8654.serialization;

import java.io.Serializable;

/**
 * Simple object with few fields which are serilizable and marked as non-serializable (transient)
 * @author Dilanka
 *
 */

public class Student implements Serializable {

	private static final long serialVersionUID = -8261123580583543165L;
	

	private String name;
	
	private int id;
		
	transient private int age;
	
	public String surName;
	
	
	@Override
	public String toString(){
		return "Student {name="+name+",id="+id+",age="+age+"}";
	}
	
	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}
	
	
	
}
