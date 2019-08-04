package com.lang;

public class Wrapper_Test 
{
	public static void main(String args[])
	{
		boolean married=true;			//Primitive boolean value
		System.out.println("boolean:"+married);//print true
		
		Boolean objboolean;  //object Boolean type
		objboolean=new Boolean(true);
		objboolean=new Boolean("false");
		
		System.out.println("boolean:"+objboolean);  //print false
		
		//object boolean type converted to primitive boolean type
		married=objboolean.booleanValue();
		System.out.println("boolean:"+married); //print false
		
		//primitive boolean type converted to object boolean type
		objboolean=Boolean.valueOf(false);
		System.out.println("boolean:"+objboolean);
		
		
		if(married==true ? true : false)
			System.out.println("Primitive boolean is true");
		else
			System.out.println("Primitive boolean is false");
		
		if(objboolean==true ? true :false)
			System.out.println("object boolean is true");
		else
			System.out.println("object boolean is false");
	}
}
