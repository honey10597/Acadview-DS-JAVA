import java.util.*;
public class staticblock4
{
	public static void main(String x[])
	{
		base b=new base();
	}
}
class base
{
	static
	{
		System.out.println("this is under 1st static block");
	}
	static 
	{
		System.out.println("this is under 2nd static block");
	}
}