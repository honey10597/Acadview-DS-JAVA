import java.util.Scanner;
public class largnum4
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is bigger");
			}
			else
				System.out.println("C is bigger");
		}
		else if(b>c)
			System.out.println("B is bigger");
		else
			System.out.println("C is bigger");
	}
}
