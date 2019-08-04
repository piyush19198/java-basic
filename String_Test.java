package com.lang;

public class String_Test 
{
	public static void main1(String args[])
	{
		String str1 = new String("MET");
		String str2 = "Nashik";
		
		//java does not support method overloading
		//+ operator is internally overloaded for string operations 
		String str3 =str1 + str2;
		System.out.println(str1 +":"+str2+":" +str3);
		
		str1 = str1 +"Mumbai";
		System.out.println("str1:"+str1);
		str1=str1.toUpperCase();
		
		for(int index=0; index<str3.length(); index++)
		{
			System.out.println(str3.charAt(index));
		}
		
		str1 = "MET";
		str3 = "MET".concat("Nashik");
		str3 = str1.concat("Nashik");
		System.out.println("str3.concat:"+str3);
		
		if(str3.endsWith("Nashik"))
		{
			System.out.println("str3.endsWith:"+"Nashik");
		}
		System.out.println("str3.indexOf:"+str3.indexOf('T'));
		System.out.println("str3.lastIndexOf:"+str3.lastIndexOf('T'));
		System.out.println("str3.replace:"+str3.replace('E','e'));
		System.out.println("str3.substring :"+str3.substring(3));

		byte bytes[] = {65,66,67,68};
		String strBytes = new String(bytes);
		System.out.println(strBytes);
	}

	public static void main2(String args[])
	{
		StringBuffer strb1 = new StringBuffer();
		System.out.println("Capacity:"+strb1.capacity());
		strb1.append("sun");
		strb1.append("\tmon");
		strb1.append("\ttue");
		strb1.append("\twed");
		strb1.append("\tthu");
		strb1.append("\tfri");
		strb1.append("\tsat");
		System.out.println(strb1);
		
		StringBuffer strb2 = new StringBuffer("MET Nashik");
		System.out.println("charAt:"+strb2.charAt(2));
		System.out.println("Delete:"+strb2.	delete(1,3));
		System.out.println("indexOf:"+strb2.indexOf("h"));
		
		
		
	}
	
	public static void main(String args[])
	{
		StringBuilder strb1 = new StringBuilder();
		System.out.println("Capacity:"+strb1.capacity());
		
		strb1.append("jan");
		strb1.append("\tfeb");
		strb1.append("\tmar");
		strb1.append("\tapr");
		strb1.append("\tmay");
		strb1.append("\tjun");
		strb1.append("\tjuly");
		strb1.append("\taug");
		strb1.append("\tsept");
		strb1.append("\tnov");
		strb1.append("\tdec");
		System.out.println(strb1);
		
		StringBuilder strb2 = new StringBuilder("MET Nashik");
		System.out.println("charAt:"+strb2.charAt(5));
		System.out.println("Delete:"+strb2.	delete(1,5));
		System.out.println("indexOf:"+strb2.indexOf("h"));
		
		
	}
	
}
	
	