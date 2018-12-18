import java.util.Scanner;
public class armstrong
{
	public static void main(String xxx[])
	{
		Scanner Scan=new Scanner(System.in);
		int a=Scan.nextInt();
		int t=a,x=0;
		int k=a,dev=1,rev=0,c=0;
		while(k!=0)
		{
		    k=k/10;
			c++;
		}
		while(a!=0)
		{
			dev=a%10;
			x=(int)Math.pow(dev,c);
			rev=rev+x;
			a=a/10;
		}
		if(t==rev)
		{
			System.out.println("armtrong "+t+" "+rev);
		}
		else
		{
			System.out.println("Not armtrong "+t+" "+rev);
		}
	}
}