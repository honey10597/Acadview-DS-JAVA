public class staticblock
{
	public static void main(String x[])
	{
		Test t=new Test();
	}
}
class Test
{
	static
	{
		System.out.println("this is under static block");
	}
}	