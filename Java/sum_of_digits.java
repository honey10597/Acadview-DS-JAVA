import java.util.Scanner;
public class sum_of_digits
{
	public static void main(String x[])
	{
		Scanner Scan=new Scanner(System.in);
		int a=Scan.nextInt();
		int sum=0,rev=0;
		while(a!=0)
		{
			rev=a%10;
			sum=sum+rev;
			a=a/10;
		}
		System.out.println("sum of digits is : "+sum);
	}
}