package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;

public class File_Reader{
	public static void main(String[] args){
		int value = 0;
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\FileReader.txt");
		
		try(FileReader fileReader = new FileReader(file){
			while((value = fileReader.read()) != -1);
			System.out.print((char)value);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();	
		}
	}
}
