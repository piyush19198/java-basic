class History{
	
}


class Student extends History{
	private String name;
	private int no;
	
	public Student() {
		super();
	}

	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + "]";
	}
	
}




public class Sample_Test {
	
	public static void main(String args[])
	{
	
	History[] array=new History[2];
	
	Student obj = new Student("Singh",10);
	Student obj1 = new Student("raj",20);
	
	array[0]=(History)obj;
	array[1]=(History)obj1;
	
	System.out.println(array[0].toString());
	System.out.println(array[1].toString());
	}

}
