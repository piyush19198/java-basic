package com.io;

// using finally block also try and catch 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_InputStream_1 {

	public static void main(String[] args) {

		File file = new File("H:\\ReadMe.txt"); // file opening
		System.out.println("Path of file : " + file.getAbsolutePath());

		FileInputStream fileInput = null;

		int value = 0;

		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ((value = fileInput.read()) != -1) {
				System.out.print((char) value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
