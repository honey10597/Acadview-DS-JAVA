public class interf
{
	public static void main(String x[])
	{
		first i=new checks();
		checkf f=new checkf();
		checks s=new checks();
		i.check();
		i.display();
		f.check();
		s.display();
	}
}
interface first
{
	void check();
	void display();
}
class checkf implements first
{
	public void check()
	{
		System.out.println("this check first class");
	}
	public void display()
	{
		System.out.println("this check first  class 1");
	}
}
class checks implements first
{
	public void check()
	{
		System.out.println("this check second class");
	}
	public void display()
	{
		System.out.println("this check second class 2");
	}
}
		