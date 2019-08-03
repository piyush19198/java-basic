//DEFAULT CONSTRUCTOR
//GETTER SETTER
//toString and equals

import java.util.Arrays;
import java.util.Scanner;

class Student{
	private int rollNo;
	private String name;
	private float marks;

	public Student(){
		setRollNo(0);
		setName("NoRecord");
		setMarks(0.0f);
    }
	public Student(int rollNo , String name , float marks){
		setRollNo(rollNo);
		setName(name);
		setMarks(marks);
	}
	public Student(Student obj){
		this.name = obj.name;
		this.rollNo = obj.rollNo;
		this.marks = obj.marks; 
    }
	public void setRollNo(int rollNo){
		this.rollNo = rollNo;
    }
	public void setName(String name){
        this.name = name;
    }
	public void setMarks(float marks){
        this.marks = marks;
    }
	public int getRollNo(){
        return this.rollNo;
    }
	public String getName(){
        return this.name;
    }
	public float getMarks(){
        return this.marks;
    }
}

class Opration extends Student{
    public void list(Student[] obj){
        System.out.println("RollNo		Name			Marks");
        for (int i=0;i<obj.length ; i++){
            System.out.println(obj[i].getRollNo()+"		"+obj[i].getName()+"			"+obj[i].getMarks());
        }
    }

    public boolean delete(int key, Student[] obj){ //USE EQUALS TO COMPARE
        for(int i=0; i<obj.length;i++){
            if(key == obj[i].getRollNo() && key == obj[i].getRollNo()){
                obj[i].setRollNo(0);
                obj[i].setName("NoRecord");
                obj[i].setMarks(0.0f);
                return true;
            }
        }
        return false;
    }
}

public class StudentList{
    public static void main(String args[]){
		Student[] s = new Student[3];
		s[0] = new Student(1,"Piyush",50f);
        s[1] = new Student(2,"Anuj",70f);
		s[2] = new Student(3,"Karan",60f);
		
        Opration op = new Opration();
        op.list(s);			//USE toString to DISPLAY ARRAY

        if(op.delete(2,s)){
            System.out.println("Student Details Deleted");
        }
        else{
            System.out.println("Student Details Not Present");
        }
		op.list(s);
	}
}



















/*
interface StudentList{
	void add(String name);
	boolean delete(String name);
	boolean search(String name);
	void list();
}

class Student{
	int roll;
	String name;
	float marks;
	
	public Student(){
		System.out.println("Student Details");
	}
	
	public int getRoll(){
		return roll;
	}
	
	public String getName(){
		return name;
	}
	
	public float getMarks(){
		return marks;
	}
	
	public int setRoll(int proll){
		roll = proll;
	}
	
	public String setName(String pname){
		name = pname;
	}
	
	public void setMarks(float pmarks){
		marks = pmarks;
	}
}

public class StudentList{
	public static void main(String Args[]){
		
	}
}
*/
