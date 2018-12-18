class base
{
	public void show()
	{
		System.out.println("Base class");
	}
}
class derived extends base
{
	derived()
	{
	super();
	}
}

public class inheritance 
{
	public static void main(String x[])
	{
		derived d=new derived();
		d.show();
		
		
	}
}