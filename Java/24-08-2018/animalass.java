public class animalass
{
	public static void main(String x[])
	{
		String breed,color;
		dog d=new dog();
		cat c=new cat();
		d.speak();
		c.speak();
	}
}
abstract class animal
{
	public void speak()
	{
		System.out.println("this is under abstract class animal");
	}
}
class dog extends animal
{
	 public void speak()
	{
		System.out.println("dog says baoo baoo");
	}
}
class cat extends animal
{
	public void speak()
	{
		System.out.println("cat says meeeoooouuuu");
	}
}
