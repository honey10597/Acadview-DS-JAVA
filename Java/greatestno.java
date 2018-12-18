import java.util.Scanner;
public class greatestno
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value of A, B & C");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a==b)
		{
			if(b==c)
			{
				System.out.println("All are equal");
			}
			else if(a>c)
			{
				System.out.println("A & B is greater and equal");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		else if(a==c)
		{
			if(a==b)
			{
				System.out.println("All are equal");
			}
			else if(a>b)
			{
				System.out.println("A & c is greater and equal");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b==c)
		{
			if(a>b)
			{
				System.out.println("A is greater");
			}
			else
			{    
	          	System.out.println("B & C is greater and equal");
			}
		}
		else if(a>b)
		{
			if(a>c)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("C");
			}
		}
		else if(b>c)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
	}
}