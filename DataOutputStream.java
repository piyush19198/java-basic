package com.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.DataOutputStream;

public class Data_OutputStream{
	public static void main(String[] args){
		int rollNo = 101;
		String name = "Amar";
		float marks = 75.5f;
		
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\ReadMe.txt");
		try(DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(file))){
			dataOutput.writeInt(rollNo);
			dataOutput.writeUTF(name);
			dataOutput.writeFloat(marks);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e1){
			e1.printStackTrace();
		}
		System.out.println("End -> DataOutputStream...");
	}
}
