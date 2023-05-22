package programs;

public class CallArgumentsWithinClass 
{
		public void pencil()
		{
			System.out.println("I have Pencil");
		}
		
		public void led_pencil(int a)
		{
			System.out.println("I have Led Pencil");
		}
		
		public void pen(String a)
		{
			System.out.println("I have Pen");
		}
	public static void main(String[] args) 
	{
		CallArgumentsWithinClass cawc= new CallArgumentsWithinClass();
		cawc.led_pencil(20);
		cawc.pen("PARKER");
		cawc.pencil();

	}

}
