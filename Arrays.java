import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class Arrays {

	public static void main(String[] args)
	{
		
		//declaration
		int[] scores;
		
		//memory is allocated and default value are set
		scores = new int[5];
		
		//initialization
		scores[0] = 0;
		scores[1] = 10;
		scores[2] = 20;
		scores[3] = 30;
		scores[4] = 40;
		
		System.out.println("Length:"+scores.length);
		
		for(int index = 0; index<scores.length;index++)
		{
		System.out.println(index);
		}
		
		//declaration,initialization
		int[] scores = {0 , 10 ,20 ,30 ,40};
		System.out.println(Arrays.toString(scores) );
		
		System.out.print(" { ");
		
		for(int index = 0; index<scores.length;index++)
		{
			System.out.println(scores[index]+", " );
		}
		System.out.println(" } ");
	}
}
