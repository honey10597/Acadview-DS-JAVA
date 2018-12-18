public class exception_handling
{
	public static void main(String x[])
	{
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
		}
		catch(/*Arithmetic*/Exception e)
		{
			System.out.println(e);
		}
		System.out.println("hello");
	}
}