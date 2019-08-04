package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class File_Writer{
	public static void main(String[] args){
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\FileReader.txt");
		
		String str1 = "ABC";
		String str2 = "CBA";
		
		try(BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file))){
			buffWriter.write(str1);
			buffWriter.write(str2);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();	
		}
		System.out.println("Message: ");
	}
}
