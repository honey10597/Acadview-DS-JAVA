import java.util.*;
public class reverse5
{
	public static void main(String xx[])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int rev=0,dup,x;
		dup=num;
		while(dup>0)
		{
			x=dup%10;
			rev=rev*10+x;
			dup=dup/10;
		}
			System.out.println(rev);
	}
}
