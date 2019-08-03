public class ForLoop{

	public static void main(String[]args){ //TO CHECK WHETHER THE ARGUMENT HAS BEEN GIVEN OR NOT
		if(args.length==0)
		{
			System.out.println("Please Provide argument");
			return;

		}
			
		int end=Integer.parseInt(arg[0]);
		
		for(int start=0;start<end;start++)
		{
			System.out.println("MET");
			start++;
		}
	}
}	
