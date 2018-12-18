import java.util.*;
public class complexno2
{
	public static void main(String x[])
	{
		
		complex c=new complex();
		c.display();
	}
}
class complex
{
	Scanner sc=new Scanner(System.in);
	int real=sc.nextInt();
	int imag=sc.nextInt();
	void display()
	{
		System.out.println(real+"+"+imag+"i");
	}
}