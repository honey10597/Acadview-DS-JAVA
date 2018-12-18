import java.util.*;
public class marksavg
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int k,sum=0;
		for(int i=0;i<5;i++)
		{
            a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		int avg=sum/5;
		System.out.println(avg);
	}
}

		