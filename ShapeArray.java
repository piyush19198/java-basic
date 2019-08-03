public class Shape_Array_Test
{
	public static void main(String args[])
	{
		Circle[] circles;
		circles new Circle[3];
		for(int index=0; index < circles; index++)
		{
			System.out.println(circles[index]);
		}

		circles[0] = new Circle(3.5f);
		cirlces[1] = new Circle(4.5f);
		circles[2] = new Circle(5.5f);
	
		for(int index=0; index < circles.length; index++)
		{
			System.out.println(circles[index].calcArea());
			circles[index].draw();
		}
	}
}
