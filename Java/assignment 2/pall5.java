import java.util.*;
public class pall5
{
	public static void main(String xx[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0,x=0,dup=a;
        while(dup>0)
		{
			x=dup%10;
			rev=rev*10+x;
			dup=dup/10;
		}
		if(rev==a)
			System.out.println("pallindrome");
		else
			System.out.println("Not pallindrome");
	}
}
