package programs;

public class LocalVariable 
{
		public void localVariable()
		{
			int i=25;
			System.out.println(i);
		}
		
		public static void localVariable1()
		{
			int a=35;
			System.out.println(a);
		}
		
	public static void main(String[] args) 
	{
		LocalVariable.localVariable1();
		LocalVariable lc=new LocalVariable();
		lc.localVariable();
	}

}
