package programs;

public class NonStaticMethod {
	public void nonStaticMethod()
	{
		System.out.println("I am inside non static method");
	}
	public static void main(String[] args) 
	{
	NonStaticMethod n= new NonStaticMethod();
	n.nonStaticMethod();

	}

}
