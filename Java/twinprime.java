import java.util.*;
public class twinprime
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int f=0;
		int i=0,j=0;
		System.out.println("enter the last no.");
		int num=sc.nextInt();
		int a[]=new int[num];
		int b[]=new int[num];
		int y=0;
		for(int i=1;i<num;i++)
		{
			f=0;
			//int x=sc.nextInt();
			//a[i]=x;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				//System.out.print(a[i]+" ");
				b[y]=i;y++;
			}
			
		}
		int l=y;
		System.out.println("\n");
		System.out.print("prime no's are : ");
		for(y=0;y<l;y++)
		{
			System.out.print(b[y]+" ");
		}
		int count=0;
		System.out.println("\n");
		for(int d=0;d<l;d++)
		{
			for(int e=d;e<l;e++)
			{
				if((b[e]-b[d])==2)
				{
					count++;
					System.out.println("twins prime is "+b[d]+" and "+b[e]);
				}
			}
		}
		System.out.println("the no. of twins from 0 to "+i+" is "+count);
	}
}