import java.util.*;
public class remove_duplicate
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many no. u want to enter ");
		int num=sc.nextInt();
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			int j=sc.nextInt();
			a[i]=j;
		}
		int dup[]=new int[100];
		int count[]=new int[100];
		int c=0;
		for(int p=0;p<num;p++)
		{
			for(int q=p;q<num;q++)
			{
				if(a[p]==a[q] && p!=q)
				{
					//dup[p]=a[p];
					//count[p]++;
					c++;
					break;
				}
			}//System.out.println(a[p]+" occurs "+count+" times");
		}
		System.out.println("repeated elements are "+c);
		/*for(int w=0;w<dup.length;w++)
		{
			System.out.println(dup[w]+" "+count[w]);
		}*/
	}
}
		