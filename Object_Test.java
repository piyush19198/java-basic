package com.lang;

public class Object_Test
{
	public static void main(String args[])
	{
		student stud=new student("amar",101);
		
		Class studentClass =stud.getClass();
		
		System.out.println(studentClass);
		System.out.println(studentClass.getName());
		
		int a=10;
		Integer objInt1 = new Integer(10);
		Integer objInt2 = new Integer(20);
		
		int result = objInt1 + objInt2;
		System.out.println("Result" +result);
		
		Integer objSum = 10 + 20 + 30;
		System.out.println("objSum" +objSum);
		
		result =add(10,20);
		result =add(objInt1,objInt2);
		
	}
	
	public static int add(int no1,int no2)
	{
		System.out.println("Add int...");
		return no1 + no2;
	}
	
	public static int add(Integer no1,Integer no2)
	{
		System.out.println("Add integer...");
		return no1 + no2;
	}
}
