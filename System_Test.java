package com.lang;

import java.util.Properties;
import java.util.Enumeration;

public class System_Test
{
	public static void main(String args[])
	{
		System.out.println();
		System.out.println(System.currentTimeMillis());
		System.out.println(System.getenv("JAVA HOME"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println("Java Version:"+System.getProperty("java.runtime.version"));
		
		Properties props=System.getProperties();
		props.list(System.out);
		
		Enumeration  keys=props.keys();
		while(keys.hasMoreElements())
		{
			String key=(String)keys.nextElement();
			String value=(String)props.get(key);
			System.out.println(key +","+value);
			
		}
	
	}
}
