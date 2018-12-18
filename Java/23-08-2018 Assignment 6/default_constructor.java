

public class default_constructor {
	public static void main(String x[])
	{
		base b=new base(10);	
	}
	
}
class base
{
	int a=10;
	base()
	{
		System.out.println("base constructor");
	}
	base(int a)
	{
		this();
	}
}
