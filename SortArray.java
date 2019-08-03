import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class SortArray{

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
		
		System.out.println(Arrays.toString(random));
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
}
