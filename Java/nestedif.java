public class nestedif
{
	public static void main(String x[])
	{
		int a=1,b=15,c=11;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
	}
}
			