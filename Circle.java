//CONSTRUCTOR
//GETTER AND SETTER METHODS
//Override 
//toString in java.lang.Object

class Circle{
	private float radius;	
	
	public Circle(){
		setRadius(0.0f);
		System.out.println("Circle -> Default...");			
	}
	
	public Circle(float radius){
		setRadius(radius);
		System.out.println("Circle -> Prameter...");		
	}
	
	public Circle(Circle otherCircle){
		setRadius(otherCircle.getRadius());
		System.out.println("Circle -> Copy...");			
	}
	
	//GETTER 
	public float getRadius(){
		return radius;
	}
	
	//SETTER 
	public void setRadius(float pradius){
		radius = pradius;
	}
	
	public double calcArea(){
		return radius*radius*3.14;
	}
	
	public void draw(){
		System.out.println("Circle is drawn...");
	}
	
	@Override	//JAVA ANNOTATION FOR COMPILER TO CHECK METHOD SIGNATURE IN java.lang.Object CLASS
	public String toString(){
		return "Radius : "+getRadius();
	}
}

public class Circle_Test{
	public static void main(String[] args){
		//DECLARATION
		Circle c1, c2, c3;
		
		//INSTANTIATION
		c1 = new Circle(3.5f);
		c1.draw();
		System.out.println("Radius of c1 = "+ c1.getRadius());
		System.out.println("Area of c1 = "+ c1.calcArea());
		
		c2 = new Circle(5.5f);
		c2.draw();
		System.out.println("Radius of c2 = "+ c2.getRadius());
		System.out.println("Area of c2 = "+ c2.calcArea());
		
		c3 = new Circle(c2);
		c3.draw();
		System.out.println("Radius of c3 = "+ c3.getRadius());
		System.out.println("Area of c3 = "+ c3.calcArea());
		
		System.out.println(c1);
		System.out.println(c2.toString());
	
	}
	
}
