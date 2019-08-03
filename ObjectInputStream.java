package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.io.Student;

public class Object_InputStream{
	public static void main(String[] args) throws ClassNotFoundException{
		//Student s1 = new Student(101, "Aman", 85.5f);
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\ObjectIOStream.txt");
		
		try(ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(file))){
			System.out.println((Student)objectInput.readObject());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("End->Object_InputStream..");
	}
}
