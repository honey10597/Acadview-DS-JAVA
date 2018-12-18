class demo
{
	int a;
	demo()
	{
		this(10);
	}
	demo(int a)
	{
		this();
	}
	void show()
	{
		System.out.println(a);
	}
}
public class inhe2
{
	public static void main(String x[])
	{
		demo b=new demo(10);
		b.show();
	}
}