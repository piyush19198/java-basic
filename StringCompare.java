public class StringCompare
{
	public static void main(String[] args)
	{
		System.out.println("String Comparison");
		string str1 , str2 ,str3 ,str4 ;
		//Using =operator
		str1 = "Amar";
		str2 = "Amar";
		
		if(str1 = str2)
		{	
			System.out.println("str1 == str2");
		}
		else
		{
			System.out.println("str1 != str2");
		}
		
		//Using new operator
		str3 = new string("Amar");
		str4 = new string("Amar");
		
		if(str3 == str4)
		{
			System.out.println("str3 == str4");
		}
		else
		{
			System.out.println("str3 != str4");
		}
	}
}
