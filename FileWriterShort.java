package com.io;
//BY SANDIP

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_2{
	public static void main(String[] args){
		try{	
			FileWriter fw = new FileWriter("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\FileWriter.txt");
			fw.write("Hello ");
			fw.close();
		}	
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Success...");
	}
}
