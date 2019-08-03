package com.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Random_Access_File{
	public static void main(String[] args){
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\RandomAccessFile.txt");
		int value = 0;
		
		try(RandomAccessFile randomFile = new RandomAccessFile(file,"rw")){
			//pointer moves to EOFException
			long eof = randomFile.length();
			System.out.println("Pointer "+randomFile.getFilePointer());
			randomFile.seek(eof);
			System.out.println("Pointer "+randomFile.getFilePointer());
			while(eof != 0){
				eof--;
				randomFile.seek(eof--);
				value = randomFile.read();
				System.out.print((char)value);
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
