import java.util.*;

public class move_zeroes 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		int i=0,j=0;
		System.out.println("enter elements of array");
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==0 && a[j]!=0)
				{
					a[i]=a[j];
					a[j]=0;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
