package com.Util;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Collection_Test_3{
	public static void main(String[] args){
		String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		/*
		//ITERATOR MECHANISM
		for(String day:weekDays){
			System.out.println(day);
		}
		*/
		
		//ONE NULL IS ALLOWED
		//INSERTION ORDER IS NOT MAINTAINED
		//INSERTED BASED ON HASH CODE
		//UNIQUE SET OF VALUES
		
		HashSet<Student> hs = new HashSet<Student>();
		//TreeSet<Student> hs = new TreeSet<Student>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println("hs:"+hs.size()+":");
		
		System.out.println(hs.size()+ ":"+hs);
		hs.add(null);	//ONLY ONE NULL IS ALLOWED
		hs.add(null);	//OVERWRITE THE PREV NULL
		
		hs.add("Sun");
		hs.add("Mon");
		hs.add("Tue");
		hs.add("Wed");
		hs.add("Thur");
		hs.add("Fri");
		hs.add("Sat");
		
		System.out.println(hs.size()+":"+hs);
		if(hs.contains("wed")){
			hs.remove("Wed");
		}
		System.out.println(hs.size()+":"+hs);
	}
}
