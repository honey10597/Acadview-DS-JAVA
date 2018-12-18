import java.util.Scanner;
public class secondlargest3
{
	public static void main(String x[])
	{
		int arr[]=new int[10];
		Scanner num=new Scanner(System.in);
		int input,max=-999,smax=-999,add=0;
		for(int i=0;i<10;i++)
		{
			input=num.nextInt();
			arr[i]=input;
			if(arr[i]>max)
			{
				max=arr[i];
				add=i;
			}	
		}
		arr[add]=-888;
		for(int j=0;j<10;j++)
		{
			if(arr[j]>smax)
			{
				smax=arr[j];
			}
		}
		
		System.out.println("first largest no. is : "+max);
		System.out.println("second largest no. is : "+smax);
	}
}