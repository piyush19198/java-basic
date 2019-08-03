
//PRINTING ASCII CHARSET
public class ASCIINumber{
	//WHITE SPACE CHARACTERS
	public static void main(String[] args){
	
		for(int index = 0; index<255; index++)
		{
			//System.out.write(index);
			System.out.print((char)index);
			//BREAK THE LINE AFTER EVERY 8 CHARACTERS
			if(index % 8 ==7)
				System.out.print("\n");
			else	
				System.out.print("\t");
			
		}
	}
}
