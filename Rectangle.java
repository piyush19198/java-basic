class Rect{
	private float len;
	private float brd;
	
	public Rect(){
		setLen(0.0f);
		setBrd(0.0f);
		System.out.println("Rect -> Default...");			
	}
	
	public Rect(float len, float brd){
		setLen(len);
		setBrd(brd);
		System.out.println("Rect -> Prameter...");			
	}
	
	public Rect(Rect otherRect){
		setLen(otherRect.getLen());
		setBrd(otherRect.getBrd());
		System.out.println("Rect -> Copy...");		
	}
	
	//GETTER METHODS
	public float getLen(){
		return len;
	}
	
	public float getBrd(){
		return brd;
	}
	
	//SETTER METHODS
	public void setLen(float plen){
		len = plen;
	}
	
	public void setBrd(float pbrd){
		brd = pbrd;
	}
	
	public double calcArea(){
		return len*brd;
	}
	
	public void draw(){
		System.out.println("Rect is drawn...");
	}
	
	@Override	//JAVA ANNOTATION FOR COMPILER TO CHECK METHOD SIGNATURE IN java.lang.Object CLASS
	public String toString(){
		return "Length: "+getLen();
		return "Breadth: "+getBrd();
	}
}

public class Rect_Test{
	public static void main(String[] args){
		Rect r1, r2, r3;
		
		r1 = new Rect(2.5f, 3.5f);
		r1.draw();
		System.out.println("Length of r1 = "+ r1.getLen());
		System.out.println("Breadth of r1 = "+ r1.getBrd());
		System.out.println("Area of r1 = "+ r1.calcArea());
		
		r2 = new Rect(1.5f, 2.5f);
		r2.draw();
		System.out.println("Length of r2 = "+ r2.getLen());
		System.out.println("Breadth of r2 = "+ r2.getBrd());
		System.out.println("Area of r2 = "+ r2.calcArea());
		
		r3 = new Rect(r2);
		r3.draw();
		System.out.println("Length of r3 = "+ r3.getLen());
		System.out.println("Breadth of r3 = "+ r3.getBrd());
		System.out.println("Area of r3 = "+ r3.calcArea());
		
		System.out.println(r1);
		System.out.println(r2.toString());
	}
	
}
