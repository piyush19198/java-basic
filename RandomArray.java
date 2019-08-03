import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class RandomArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size;
		
		//MEMORY IS ALLOCATED AND DEFAULT VALUES ARE SET
		System.out.println("Enter Size : ");
		size = sc.nextInt();
		int[] random = new int[size];
		for(int index = 0; index < size; index++){
			random[index] = (int)(Math.random()*100);
		}
		System.out.println("Random Value Array : "+Arrays.toString(random));
	}
}
