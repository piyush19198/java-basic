package com.io;

import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.File;



public class Buffered_InputStream{
	public static void main(String[] args){
		File file = new File ("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\ReadMe.txt");		
		System.out.println(file.getAbsolutePath());
	
		byte[] bytes = new byte[10];
		try(BufferedInputStream buffInput = new BufferedInputStream(new FileInputStream(file))){
			while((buffInput.read(bytes, 0, bytes.length)) != -1){
				System.out.println(Arrays.toString(bytes));
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
	}
}
