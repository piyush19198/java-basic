package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.portable.OutputStream;

public class File_OutputStream_1 {

	public static void main(String[] args) throws FileNotFoundException {
		String message= "Hello ! Hindustanioo";
		
		try(FileOutputStream fileOutput = new FileOutputStream("H:\\ReadMe.txt")){
				fileOutput.write(message.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End - File_OutputStream_1....");
		
	}

}
