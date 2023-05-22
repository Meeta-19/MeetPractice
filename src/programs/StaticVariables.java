package programs;

public class StaticVariables 
{
		static int i= 10;
		static int j=8;
	public static void main(String[] args) 
	{
		StaticVariables sv=new StaticVariables();
		sv.addition();
		sv.multiplication();
	}

	public void addition()
	{
		int a=i+j;
		System.out.println(a);
	}
	
	public void multiplication()
	{
		int b=i*j;
		System.out.println(b);	
	}
}
