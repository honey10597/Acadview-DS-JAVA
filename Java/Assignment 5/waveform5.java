import java.util.*;
public class waveform5
{
	public static void main(String x[])
	{
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		int temp=0,prev=0;
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<10;j++)
		{
			if(j%2!=0)
			{
				temp=arr[j];
				arr[j]=prev;
				prev=temp;
				arr[j-1]=temp;
			}
			prev=arr[j];
		}
		for(int k=0;k<10;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}
}