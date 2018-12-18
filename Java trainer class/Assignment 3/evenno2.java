import java.util.*;
public class evenno2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
}
