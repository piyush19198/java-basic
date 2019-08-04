import java.io.Console;

public class Console_Test {
	
	public static void main(String args[])
	{
		Console c= System.console();
		
		if(c==null) 
			System.out.println("no console available");
			System.exit(0);
		
		System.out.println("Enter the name");
		String name =c.readLine();
		
		
		
		
		System.out.println("Enter the password");
		char[] pass = c.readPassword();
		
		System.out.println(name+" "+pass.toString());
	}

}
