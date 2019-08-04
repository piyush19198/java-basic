package com.lang;

class student 
{
	String name;
	int rollNo;
	
	public student(String name, int rollNo)
	{
		super();
		this.name = name;
		this.rollNo = rollNo;
		
	}
	

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getRollNo() 
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	
	@Override
	public String toString() {
		return "student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

}
