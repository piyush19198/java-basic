class Triangle{
	//FIELDS...
	private float bse;
	private float hgt;
	
	public Triangle(){
		setLen(0.0f);
		setBrd(0.0f);
		System.out.println("Triangle -> Default...");			
	}
	
	public Triangle(float bse, float hgt){
		setLen(bse);
		setBrd(hgt);
		System.out.println("Triangle -> Prameter...");			
	}
	
	public Triangle(Triangle otherRect){
		setLen(otherRect.getLen());
		setBrd(otherRect.getBrd());
		System.out.println("Triangle -> Copy...");
	}
	
	//GETTER METHODS
	public float getLen(){
		return bse;
	}
	
	public float getBrd(){
		return hgt;
	}
	
	//SETTER METHODS
	public void setLen(float plen){
		bse = plen;
	}
	
	public void setBrd(float pbrd){
		hgt = pbrd;
	}
	
	public double calcArea(){
		return bse*hgt*0.5;
	}
	
	public void draw(){
		System.out.println("Triangle is drawn...");
	}
}

public class Triangle_Test{
	public static void main(String[] args){
		Triangle t1, t2, t3;
		
		t1 = new Triangle(1.5f, 1.5f);
		t1.draw();
		System.out.println("Length of t1 = "+ t1.getLen());
		System.out.println("Breadth of t1 = "+ t1.getBrd());
		System.out.println("Area of t1 = "+ t1.calcArea());
		
		t2 = new Triangle(1.5f, 2.5f);
		t2.draw();
		System.out.println("Length of t2 = "+ t2.getLen());
		System.out.println("Breadth of t2 = "+ t2.getBrd());
		System.out.println("Area of t2 = "+ t2.calcArea());
		
		t3 = new Triangle(t2);
		t3.draw();
		System.out.println("Length of t3 = "+ t3.getLen());
		System.out.println("Breadth of t3 = "+ t3.getBrd());
		System.out.println("Area of t3 = "+ t3.calcArea());
	}
	
}
