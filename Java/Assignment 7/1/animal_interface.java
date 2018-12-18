public class animal_interface
{
	public static void main(String x[])
	{
		animal a=new dog();
		cat c=new cat();
		dog d=new dog();
		a.speak(); 
		a.eat();
		c.speak();
		c.eat();
		/*d.speak();
		d.eat();*/
	}
}
interface animal
{
	void speak();
	void eat();
}
class cat implements animal
{
	public void speak()
	{
		System.out.println("cat says meeeaaooo");
	}
	public void eat()
	{
		System.out.println("cat eats mouse");
	}
}
class dog implements animal
{
	public void speak()
	{
		System.out.println("dog says baaoo baaoo");
	}
	public void eat()
	{
		System.out.println("dog eats pedigiri");
	}
}