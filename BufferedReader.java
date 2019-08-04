package com.io;

import java.io.BufferReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader{
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try{
			System.out.println("Enter a message ");
			input = reader.readLine();
		}
		catch(IOException e){
			e.printStackTrace();	
		}
		System.out.println("Message: "+input);
	}
}
