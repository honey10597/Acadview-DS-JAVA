import java.util.*;
public class prime6
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int f=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				f=1;
				break;
			}
			else
				f=0;
		}
		if(f==1)
			System.out.println("not prime");
		else
			System.out.println("prime");
	}
}
