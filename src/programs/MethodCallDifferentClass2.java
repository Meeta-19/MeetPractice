package programs;

public class MethodCallDifferentClass2 
{

	public static void main(String[] args) 
	{
		MethodCallDifferentClass.myName();
		MethodCallDifferentClass mcdc= new MethodCallDifferentClass();
		mcdc.myQualification();

	}

}
