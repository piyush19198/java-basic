class Rectangle
{

	//fields
	private float length;
	private float breadth;
	
	public Rectangle()
	{
		setLength(0.0f);
		setBreadth(0.0f);
		System.out.println("Rectangle->def..");   //default constructor
	}
	
	public Rectangle(float length,float breadth)
	{
		setLength(length);
		setBreadth(breadth);
		System.out.println("Rectangle->param...");
	}
	
	public Rectangle(Rectangle otherRectangle)
	{
		setLength(otherRectangle.getLength());
		setBreadth(otherRectangle.getBreadth());
		System.out.println("Rectangle->copy..");
	}
	
	//getter
	public float getLength()
	{
		return length;
	}
	
	public float getBreadth()
	{
		return breadth;
	}
	//setter method
	//mutators
	public void setLength(float plength)
	{
			length = plength;
	}
	
	public void setBreadth(float pbreadth)
	{
			breadth = pbreadth;
	}
	public double calcArea()
	{
		return length*breadth;	
	}
	
	public void draw()
	{
		System.out.println("Rectangle is drawn..");
	}
	@Override//for compiler to check the method signature in java.lang.Object class
	public String toString()
	{
		return "Length:"+getLength();
		return "Breadth:"+getBreadth();
	}
	public boolean equals(Object obj)
	{
		System.out.println("In equals...");
		if(obj == null){return false;}
		if(obj == this){return false;}
		if(!(obj instanceof Rectangle)){return false;}
	
		Rectangle otherRectangle = (Rectangle) obj;
		if( length == otherRectangle.getLength()){
			return true;
		}
		else{
			return false;
		}
		
		Rectangle otherRectangle = (Rectangle) obj;
		if( breadth == otherRectangle.getBreadth()){
			return true;
		}
		else{
			return false;
		}
	}
}	
	public class EqualsMethodRect
	{
		public static void main(String args[])
		{
			//declaration
			Rectangle r1, r2, r3;
			
			//instantiation
			r1 = new Rectangle();
			r1.draw();
			System.out.println("Length "+ r1.getLength());
			System.out.println("Breadth "+ r1.getBreadth());
			System.out.println("Area "+ r1.calcArea());
			
			r2 = new Rectangle(5.5f,5.4f);
			r2.draw();
			System.out.println("Length "+ r2.getLength());
			System.out.println("Breadth "+ r2.getBreadth());
			System.out.println("Area "+ r2.calcArea());
			
			r3 = new Rectangle(r2);
			r3.draw();
			System.out.println("Length "+ r3.getLength());
			System.out.println("Breadth "+ r3.getBreadth());
			System.out.println("Area "+ r3.calcArea());
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(r3);
			
			if(r1.equals(r2))
			{
				System.out.println("r1 equals r2...");
			}
			else
			{
				System.out.println("r1 not equals r2");
			}
			System.out.println(r1.toString());
		}
	}
	

