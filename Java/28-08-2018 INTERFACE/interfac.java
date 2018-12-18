import java.util.*;
interface animal
{
	void display();
}
class dog implements animal
{
	public void display()
	{
		System.out.println("I am Dog");
	}
}
class cat implements animal
{
	public void display()
	{
		System.out.println("I am cat");
	}
}


public class interfac
{
	public static void main(String x[])
	{
		animal a=new dog();
		dog d=new dog();
		cat c=new cat();
		a.display();
		d.display();
		c.display();
	}
}