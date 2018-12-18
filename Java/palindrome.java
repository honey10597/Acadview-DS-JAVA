import java.util.Scanner;
public class palindrome
{
	public static void main(String x[])
	{
		Scanner Scan=new Scanner(System.in);
		int a=Scan.nextInt();
		int dup=a,rev=0,t;
		while(a!=0)
		{
			t=a%10;
			rev=rev*10+t;
			a=a/10;
		}
		if(rev==dup)
		{
			System.out.println("palindrome "+rev+"  "+dup);
		}
		else
		{
			System.out.println("not palindrome "+rev+"  "+dup);
		}
	}
}