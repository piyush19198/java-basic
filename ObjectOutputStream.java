package com.io;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream; 
import com.io.Student;
import java.io.FileOutputStream;

public class Object_OutputStream {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Aman", 85.5f);
		File file = new File("C:\\Users\\touch\\Desktop\\JavaPiyush\\Day 8\\PreRecess\\ObjectIOStream.txt");
		
		try(ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream(file))){
			objectOutput.writeObject(s1);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("End -> Object_OutputStream");
	}
}
