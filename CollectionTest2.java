package com.Util;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;
//import java.util.Iterator;
//import java.util.List;

class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private float marks;

	public Student() {
		setRollNo(0);
		setName("NoRecord");
		setMarks(0.0f);
	}

	public Student(int rollNo, String name, float marks) {
		setRollNo(rollNo);
		setName(name);
		setMarks(marks);
	}

	public Student(Student obj) {
		this.name = obj.name;
		this.rollNo = obj.rollNo;
		this.marks = obj.marks;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return this.rollNo;
	}

	public String getName() {
		return this.name;
	}

	public float getMarks() {
		return this.marks;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
/*
 * class Student implements Comparable<Student>{
 * 
 * @Override public int compareTo(Student otherStudent){ return
 * this.rollNo.otherStudent.rollNo; } }
 */


public class Collection_Test_2 {
	public static void main(String[] args){
		Student s1 = new Student(101, "Amar", 55.5f);
		Student s2 = new Student(103, "Anthony", 85.5f);
		Student s3 = new Student(102, "Akbar", 75.5f);
		
		ArrayList<Student> lst_Student = new ArrayList<Student>();
		lst_Student.add(s1);
		lst_Student.add(s2);
		lst_Student.add(s3);
		System.out.println(lst_Student);
		
		Collections.sort(lst_Student);
		System.out.println(lst_Student);	
	}
}
