package com.io;

import java.lang.String;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable{
	int rollNo;
	String name;
	float marks;
	
	public Student(int rollNo, String name, float marks){
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
}
