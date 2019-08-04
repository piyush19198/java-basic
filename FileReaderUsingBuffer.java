package com.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

//Using BufferedReader

public class File_Reader_2{
	public static void main(String[] args){
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\FileReader.txt");
		System.out.println(file.getAbsolutePath());
		
		String line = null;
		
		try(BufferedReader buffReader = new BufferedReader(new FileReader(file))){
			while((line = buffReader.readLine()) != null)
			System.out.print(line);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();	
		}
	}
}
