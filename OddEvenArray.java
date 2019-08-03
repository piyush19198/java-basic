 import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class OddEvenArray{

	public static void main(String[] args){
		
		int[] random;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter size of the array");
		int size = in.nextInt();
		
		//MEMORY IS ALLOCATED AND DEFAULT VALUES ARE SET
		random = new int[size];
		
		for(int i = 0; i<size; i++){
			random[i] = (int)((Math.random()*100));
		}
		
		System.out.println(Arrays.toString(random));
		
		sortAsc(random); 
		
		System.out.println("Ascending order");
		System.out.println(Arrays.toString(random));
		
		System.out.println("Odd array");
		int[] oddNumber = getOddNumbers(random);
		System.out.println(Arrays.toString(oddNumber));
		
		System.out.println("Even array");
		int[] evenNumber = getEvenNumbers(random);
		System.out.println(Arrays.toString(evenNumber));
	}
	
	//SORTING ALGORITHM
	public static void sortAsc(int[] random){
		
		
		for(int i=0; i<random.length; i++){
			for(int j=i+1; j<random.length; j++){
				if(random[i]>random[j]){
					int temp;
					temp = random[i];
					random[i] = random[j];
					random[j] = temp;
				}
			}
		}
	}
	
	//METHOD TO FIND ODD NUMBERS
	public static int[] getOddNumbers(int[] random){
		int[] oddArray;
		int oddCount = 0;
		
		for(int i=0;i<random.length; i++)
			if(random[i]%2 != 0)
				oddCount++;
			
		oddArray = new int[oddCount];
		
		int  j=0;
		for(int i=0; i<random.length; i++){
			if(random[i]%2 != 0){
				oddArray[j++] = random[i];
			}
		}
		
		
		return oddArray;
	}
	
	//METHOD TO FIND EVEN NUMBERS
	public static int[] getEvenNumbers(int[] random){
		int[] evenArray;
		int evenCount = 0;
		
		for(int i=0;i<random.length; i++)
			if(random[i]%2 == 0)
				evenCount++;
			
		evenArray = new int[evenCount];
		
		int  j=0;
		for(int i=0; i<random.length; i++){
			if(random[i]%2 == 0){
				evenArray[j++] = random[i];
			}
		}
		return evenArray;
	}
}
