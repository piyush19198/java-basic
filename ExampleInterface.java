import com.interfaces.AdvCalculator;
import com.interfaces.Calculator;
public class ExampleInterface{
    public static void main(String args[])
    {
        Calculator cal ;
        AdvCalculator advcal;

        MyCalculator myCalculator = new MyCalculator();

        myCalculator.add(10,5);
        myCalculator.sub(10,5);
        myCalculator.mul(10,5);
        myCalculator.div(10,5);

        cal = myCalculator ;  //or cal = new MyCalculator (cal object is use as a pointer for MyCalculator)

        System.out.println(cal.add(10,5));
        System.out.println(cal.sub(10,5));
        //cal.mul(10,5);
        //cal.div(10,5);    // we cannot call mul and div method because it is not present in Calculator interface


         advcal = myCalculator ;  //or advcal = new MyCalculator (advcal object is use as a pointer for MyCalculator)

        //advcal.add(10,5);
        //advcal.sub(10,5);         // we cannot call add and sub method because it is not present in AdvCalculator interface
        System.out.println(advcal.mul(10,5));
        System.out.println(advcal.div(10,5));    
    }
}