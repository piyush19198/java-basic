package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_Writer{
	public static void main(String[] args){
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\FileWriter.txt");
		try(PrintWriter writer = new PrintWriter(new FileWriter(file))){
				writer.print(101);
				writer.print("Aman");
				writer.print(75.5f);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
