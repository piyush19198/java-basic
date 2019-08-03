package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.File;

public class Buffered_OutputStream{
	public static void main(String[] args){
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\ReadMe.txt");
		
		String str1 = "Line...1";
		String str2 = "Line...2";
		String str3 = "Line...3";
		
		try(BufferedOutputStream buffOutput = new BufferedOutputStream(new FileOutputStream(file))){
			buffOutput.write(str1.getBytes());
			buffOutput.write(str2.getBytes());
			buffOutput.write(str3.getBytes());
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
