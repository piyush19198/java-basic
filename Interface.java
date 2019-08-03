//WHEN TO USE ABSTRACT CLASS AND INTERFACES
interface Calculator{
	//FIELDS
	
	//ABSTRACT FIELDS
	
	public abstract int add(int no1, int no2);
	int sub(int no1, int no2);
}

interface AdvCalculator{
	//ABSTRACT METHODS
	int mul(int no1, int no2);
	int div(int no1, int no2);
}

class MyCalculator implements Calculator, AdvCalculator{
	@Override
	public int add(int no1, int no2)
	{
		return no1+no2;
	}
	
	@Override
	public int sub(int no1, int no2)
	{
		return no1-no2;
	}
	
	@Override
	public int mul(int no1, int no2)
	{
		return no1*no2;
	}
	
	@Override
	public int div(int no1, int no2)
	{
		return no1/no2;
	}
}

public class InterfaceTest{
	public static void main(String[] args){
		Calculator calc;
		AdvCalculator advCalc;
		
		MyCalculator myCalc;
		myCalc = new MyCalculator();
		
		calc = myCalc;
		advCalc = myCalc;
		
		calc.add(2,2);
		System.out.println("Addition is :"+calc.add(2,2));
		calc.sub(2,2);
		System.out.println("Subtraction is :"+calc.sub(2,2));
		advCalc.mul(2,2);
		System.out.println("Multiplication is :"+advCalc.mul(2,2));
		advCalc.div(2,2);
		System.out.println("Division is :"+advCalc.div(2,2));
	}
}
