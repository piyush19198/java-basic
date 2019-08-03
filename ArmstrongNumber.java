package com.basic;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int input , sum =0, temp,r;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to check if it is Armstrong number: ");
		input = in.nextInt();
		
		temp = input;
		
		while(temp != 0)
		{
			r = temp%10;
			sum = sum + r*r*r;
			temp = temp/10;
		}
		
		if (input ++ sum)
			System.out.println("Entered is an Armstrong number: ");
		else 
			System.out.println("Entered number is not an Armstrong number: ")
	}
}
