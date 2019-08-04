package com.io;

// try block with resources (removing absolute block) 

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File_InputStream_2 {

	public static void main(String[] args) {

		File file = new File("H:\\ReadMe.txt"); // file opening
		System.out.println("Path of file : " + file.getAbsolutePath());

		int value = 0;

		try (FileInputStream fileInput = new FileInputStream(file)) {

			while ((value = fileInput.read()) != -1) {

				System.out.print((char) value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
