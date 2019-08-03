import java.util.Scanner;

public class Vowels{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Message: ");
		String message = in.nextLine();
		System.out.println("Message: "+message);
		
		/*for(int index=0;index < message.length(); index++){
			char chr = message.charAt(index);
            if (chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
			{
				System.out.println(message.charAt(index));
			}*/
        int index = 0, v, c;
        do{
            char chr = message.charAt(index);
            index++;
                switch(chr){
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        v++;
                        break;
                    default :
                        c++;
                        break;
                }
            }while(index<message.length());
		System.out.println(+c);
        System.out.println(+v);
	}
}
