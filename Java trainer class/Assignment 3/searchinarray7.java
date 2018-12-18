import java.util.*;
public class searchinarray7
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int f=0;
		int arr[]={1,4,6,7,8,9,10};
		for(int i=0;i<7;i++)
		{
			if(arr[i]==a)
			{
				f=1;
				break;
			}
			else
				f=0;
		}
		if(f==1)
			System.out.println("no. found in array");
		else
			System.out.println("not found");
	}
}