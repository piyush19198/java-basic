//INTERFACE

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

interface Dynamic_ArrayOperation{
	void add(String name);
	boolean delete(String name);
	boolean search(String name);
	void list();
}

interface SortOperation{
	void sortAsc();
	void sortDesc();
}

class Dynamic_Array implements Dynamic_ArrayOperation, SortOperation{
	private String[] names;
	public Dynamic_Array(int size){
		names=new String[size];
	}
	
	public void add(String name){
		for(int index=0; index<names.length; index++){
			if(names[index]==null){
				names[index]=name;
				break;
			}
		}
		System.out.println("Element is Stored in Array :");
	}
	
	public boolean delete(String name){
		boolean isDeleted=false;	
		for(int index=0; index<names.length; index++){
			if(names[index] != null && names[index].equals(name)){
				names[index]=null;
				isDeleted=true;
				break;
			}
		}
		System.out.println("Element is deleted");	
		return isDeleted;
	}
	
	public boolean search(String name){
		boolean isFound=false;
		for(int index=0; index<names.length; index++){
			if(names[index] != null && names[index].equals(name)){
				isFound=true;
				break;
			}
		}
		System.out.println("Element is found");	
		return isFound;
	}
	
	public void list(){
		System.out.println(Arrays.toString(names));
	}
	
	public void sortAsc(){
		Arrays.sort(this.names);
	}
	
	public void sortDesc(){
		Arrays.sort(this.names,Collections.reverseOrder());
	}
}
public class DynamicArray{
	public static void main(String Args[]){
		Dynamic_Array objDynamic_Array;
		
		/*
		int size;
		char name;
		
		System.out.println("Enter the Strength of student:");
		String names[];
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		names= new String[size];
		System.out.println("Enter the names of student:");
		for(int i=0; i<size; i++){
			names[i] = sc.next();
			objDynamic_Array.add(names);
		}
		*/
		
		int size = 4;
		
		objDynamic_Array = new Dynamic_Array(size);
		objDynamic_Array.add("Piyush");
		objDynamic_Array.add("Anuj");
		objDynamic_Array.add("Karan");
		objDynamic_Array.add("Abhi");
		
		objDynamic_Array.list();
		
		System.out.println("Sorting in Assensding:");
		objDynamic_Array.sortAsc();
		objDynamic_Array.list();
		
		System.out.println("Sorting in Desending");
		objDynamic_Array.sortDesc();
		objDynamic_Array.list();
		
		
		objDynamic_Array.search("Piyush");
		objDynamic_Array.delete("Karan");
		objDynamic_Array.list();
	}
}
