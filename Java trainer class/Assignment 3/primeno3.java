import java.util.*;
public class primeno3
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int f;
		for(int i=2;i<=a;i++)
		{
			f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
				System.out.print(i+" ");
		}
	}
}