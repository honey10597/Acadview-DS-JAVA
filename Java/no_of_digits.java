import java.util.Scanner;
public class no_of_digits
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int c=0;
		while(a!=0)
		{
			a=a/10;
			c++;
		}
		System.out.println(c);
	}
}