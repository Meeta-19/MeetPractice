package programs;

public class MethodCallWithinClass 
{
	public static void myMethod1()
	{
		System.out.println("I am inside static method");
	}

		public void myMethod2()
		{
			System.out.println("I am inside non static method");
		}
	public static void main(String[] args) 
	{
	//	MethodCallWithinClass.myMethod1();   //
		MethodCallWithinClass mm= new MethodCallWithinClass();
		mm.myMethod2();
		MethodCallWithinClass.myMethod1();
	}

}
