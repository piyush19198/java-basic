package com.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Echo_test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String msg;
		char ans;
	
			String lineSeparator = System.getProperty("line.separator");
			//fos.write(lineSeparator.getBytes()); // for using \n
		
			try(FileOutputStream outputStream = new FileOutputStream("H:\\Re.txt")) {
				while(true){
					System.out.println("Input the text : ");
					msg = in.next();
					if(!msg.equals("quit")){
						outputStream.write(msg.getBytes());
						outputStream.write(lineSeparator.getBytes());
					}
					else
						break;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}

}
