import com.Abstract.Shape;

public class Abstract_Test_Circle {
	
	public static void main(String args[])
	{
		Circle c1,c2,c3;

        c1 = new Circle(3.5f);
        c2 = new Circle(5.5f);
        c3 = new Circle(8.5f);

        System.out.println(c1.drawCircle()+" C1 Area is : " + c1.calArea());
        System.out.println(c2.drawCircle()+"C2 Area is : " + c2.calArea());
        System.out.println(c3.drawCircle()+"c3 Area is : " + c3.calArea());
        
        Object[] shapes = new Object[3];
        shapes[0] = c1;
        shapes[1] = c2;
        shapes[2] = c3;

        Shape shape=null;
        
        for(int index=0; index<shapes.length; index++) {
        	if(shapes[0] instanceof Circle) {
        		System.out.println(((Circle) shapes[0]));
        	}
        }
	}

}
