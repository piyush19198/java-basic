import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		String operation;
		
		System.out.println("Enter No. 1 : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter No. 2 : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter Operation to be performed : ");
		operation = sc.next();		
		
		switch(operation)
		{
			case "+":
				result = add(num1 , num2);
				System.out.println("Result is : "+result);
				break;
			case "-":
				result = sub(num1 , num2);
				System.out.println("Result is : "+result);
				break;
			case "*":
				result = mul(num1 , num2);
				System.out.println("Result is : "+result);
				break;
			case "/":
				result = div(num1 , num2);
				System.out.println("Result is : "+result);
				break;
			default :
				System.out.println("Operation is not Valid ");
				break;
		}
	
	}
		public static int add(int num1, int num2){
			return num1+num2;
		}
		public static int sub(int num1, int num2){
			return num1-num2;
		}
		public static int mul(int num1, int num2){
			return num1*num2;
		}
		public static int div(int num1, int num2){
			return num1/num2;
		}
}
