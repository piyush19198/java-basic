class Square{
	private float side;	
	
	public Square(){
		setside(0.0f);
		System.out.println("Square -> Default...");			
	}
	
	public Square(float p_side){
		setside(p_side);
		System.out.println("Square -> Prameter...");			
	}
	
	public Square(Square otherSquare){
		setside(otherSquare.getSide());
		System.out.println("Square -> Copy...");			
	}
	
	//GETTER METHODS
	public float getSide(){
		return side;
	}
	
	//SETTER METHODS
	public void setside(float p_side){
		side = p_side;
	}
	
	public double calcArea(){
		return side*side;
	}
	
	public void draw(){
		System.out.println("Square is drawn...");
	}

	@Override	//JAVA ANNOTATION FOR COMPILER TO CHECK METHOD SIGNATURE IN java.lang.Object CLASS
	public String toString(){
		return "Side"+getSide();
	}
}

public class Square_Test{
	public static void main(String[] args){
		Square s1, s2, s3;
		
		s1 = new Square(2.5f);
		s1.draw();    
		System.out.println("Side of s1 = "+ s1.getSide());
		System.out.println("Area of s1 = "+ s1.calcArea());
		
		s2 = new Square(12.5f);
		s2.draw();
		System.out.println("Side of s2 = "+ s2.getSide());
		System.out.println("Area of s2 = "+ s2.calcArea());
		
		s3 = new Square(s2);
		s3.draw();
		System.out.println("Side of s3 = "+ s3.getSide());
		System.out.println("Area of s3 = "+ s3.calcArea());
		
		System.out.println(s1);
		System.out.println(s2.toString());
	}
	
}
