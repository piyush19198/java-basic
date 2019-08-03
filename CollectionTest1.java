package com.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Test{
	public static void main(String[] args){
		String[] weekDays = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		/*ITERATOR MECHANISM
		for(String day:weekDays){
			System.out.println(day);
		}
		*/
		
		System.out.println(Arrays.toString(weekDays));
		Arrays.sort(weekDays);
		System.out.println(Arrays.toString(weekDays));
		
		int[] nums = {1, 3, 5, 2, 4};
		System.out.println(Arrays.toString(nums));
		//int WILL GET CONVERTED INTO WRAPPER TYPE INTEGER
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		ArrayList<String> lstWeekDays = new ArrayList<>();
		//LinkedList<String> lstWeekDays = new LinkedList<>();
		//Vector<String> lstWeekDays = new Vector<>();
		
		System.out.println(lstWeekDays.size()+":"+lstWeekDays);
		
		lstWeekDays.add("Sun");
		lstWeekDays.add("Mon");
		lstWeekDays.add("Tue");
		
		System.out.println(lstWeekDays.size()+":"+lstWeekDays);
		
		lstWeekDays.add("Wed");
		lstWeekDays.add("Thur");
		lstWeekDays.add("Fri");
		lstWeekDays.add("Sat");
		
		System.out.println(lstWeekDays.size()+":"+lstWeekDays);
		
		lstWeekDays.add("1");
		System.out.println(lstWeekDays.size()+":"+lstWeekDays);
		
		lstWeekDays.remove(5);
		
		/*
		Iterator<String> itr = lstWeekDays.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		Collections.sort(lstWeekDays);
		System.out.println(lstWeekDays.size()+":"+lstWeekDays);
	}
}
