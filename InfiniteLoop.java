public class WhileLoop{

	public static void main(String[]args){
		System.out.println("WhileLoop...");
		System.out.println("Argument:"+arg[0]);
		
		int start=1; //CONVERTING STRING TO INT TYPE USING Integer.parseInt System function
		int end=Integer.parseInt(arg[0]);
		
		do
		{
			System.out.println("\n"+start);
			start++;
			if(start==10)
				break;
		}while(true);
	}
}
