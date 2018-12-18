import java.util.*;
public class reverse_array
{
	public static void main(String xo[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
}