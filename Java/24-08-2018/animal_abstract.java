import java.util.*;

abstract class animal
{
	public void eat()
	{
		System.out.println("I am Eating");
	}
	public void drink()
	{
		System.out.println("I am Drinking");
	}
	abstract public void display();
}
class dog extends animal
{
	public void display()
	{
		System.out.println("I am DOG");
	}
}
class cat extends animal{
	public void display()
	{
		System.out.println("I am CAT");
	}
}
public class animal_abstract
{
	public static void main(String x[])
	{
		dog d=new dog();
		cat c=new cat();
		
		d.display();
		d.drink();
		d.eat();
		
		c.display();
		c.drink();
		c.eat();
	}
}
