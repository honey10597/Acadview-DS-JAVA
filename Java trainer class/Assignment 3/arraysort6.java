import java.util.*;
public class arraysort6
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
        int a[]={1,1,1,1,0,0,1,0};
		int temp;
		for(int i=0;i<sizeof(a);i++)
		{
			for(int j=i+1;j<sizeof(a);j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<sizeof(a);k++)
		{
			System.out.println(a[k]);
		}
	}
}