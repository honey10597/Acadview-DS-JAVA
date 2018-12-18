/*2. Create an Abstract Class Animals with color, breed and 
name as variables, along with eat() 
abstract method and also a speak() method which is not abstract.*/
import java.util.*;
public class abs_animal_2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name : ");
		String name=sc.next();
		System.out.println("enter color : ");
		String color=sc.next();
		System.out.println("enter breed : ");
		String breed=sc.next();
		animal a=new dog();
		a.speak(name,color,breed);
		a.eat();
	}
}
abstract class animal
{
	abstract void eat();
	public void speak(String name,String color,String breed)
	{
		System.out.println("name is : "+name);
		System.out.println("color is : "+color);
		System.out.println("breed is : "+breed);
	}
}
class dog extends animal
{
	public void eat()
	{
		System.out.println("dog eats");
	}
	
}
