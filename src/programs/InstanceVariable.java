package programs;

public class InstanceVariable 
{
	int a=20;
	int b=5;

	public static void main(String[] args) 
	{
			InstanceVariable iv= new InstanceVariable();
			iv.substraction();
			iv.division();
	}

		public void substraction()
		{
			int d=a-b;
			System.out.print(d);
		}
		
		public void division()
		{
			int c=a/b;
			System.out.print(c);
		}
}
