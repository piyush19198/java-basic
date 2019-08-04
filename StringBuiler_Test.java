
public class StringBuiler_Test {

	public static void main(String[] args) {
		StringBuilder string1 = new StringBuilder("Indrajeet");
		System.out.println("String 1 is: "+ string1);
		
		StringBuilder string2 = new StringBuilder();
		string2.insert(0, string1+" Singh");
		System.out.println("String 2 is :"+ string2);
		
		StringBuilder string3 = new StringBuilder();
		string3.insert(0,string1.reverse());
		System.out.println("String 1 is revers & String 1 is copide into String3 :==>> String1 ="+ string1 +" = String 3= "+string3);
		
		string2.append(" Badgujar");
		System.out.println("String 2 is Appendd = "+string2);
		
		StringBuilder string5 = new StringBuilder();
		
		System.out.println("String 5  capacity is "+string5.capacity());
		
		

	}
}
