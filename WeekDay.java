import java.util.Scanner;
public class WeekDay{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a WeekDay: ");
		String WeekDay = in.nextLine();
        System.out.println("Day:"+WeekDay);
        /*
        if(WeekDay == "Sunday"){
            System.out.println("Day:"+WeekDay + "is 0 day");
        }
        else if(WeekDay == "Monday"){
            System.out.println("Day:"+WeekDay + "is 1 day");
        }
        else if(WeekDay == "Tuesday"){
            System.out.println("Day:"+WeekDay + "is 2 day");
        }
        else if(WeekDay == "Wednesday"){
            System.out.println("Day:"+WeekDay + "is 3 day");
        }
        else if(WeekDay == "Thursday"){
            System.out.println("Day:"+WeekDay + "is 4 day");
        }
        else if(WeekDay == "Friday"){
            System.out.println("Day:"+WeekDay + "is 5 day");
        }
        else if(WeekDay == "Saturday"){
            System.out.println("Day:"+WeekDay + "is 6 day");
        } */
        switch(WeekDay){
            case "Sunday":
                System.out.println("0");
                break;
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case "Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
        }
    }
}
