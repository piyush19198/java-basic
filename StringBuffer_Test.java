
public class StringBuffer_Test {

	public static void main(String[] args) {
		StringBuffer string1 = new StringBuffer("Indrajeet");
		System.out.println("String 1 is: "+ string1);
		
		StringBuffer string2 = new StringBuffer();
		string2.insert(0, string1+" Singh");
		System.out.println("String 2 is :"+ string2);
		
		StringBuffer string3 = new StringBuffer();
		string3.insert(0,string1.reverse());
		System.out.println("String 1 is revers & String 1 is copide into String3 :==>> String1 ="+ string1 +" = String 3= "+string3);
		
		string2.append(" Badgujar");
		System.out.println("String 2 is Appendd = "+string2);
		
		StringBuffer string5 = new StringBuffer();
		
		System.out.println("String 5  capacity is "+string5.capacity());
		
		String string6 = string2.toString();
		char name[]=string6.toCharArray();
		int size =0;
		while( name.length-1!=size)
		{
			if(name[size]!='\u0020') // name[i]==' ';
				System.out.print(name[size]);
			else
				System.out.println();
			size++;
		}
	}
}
