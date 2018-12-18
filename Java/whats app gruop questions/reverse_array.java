import java.util.Scanner;
public class reverse_array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		
		int p=0;
		for(int i=0;i<5;i++)
		{
			int x=sc.nextInt();
			arr[i]=x;
		 p=i;
		}
		int y=p+p;
    int d=0;
		for(int q=p+1;q<10;q++)
		{
			arr[q]=arr[d];
			d++;
		}
		for(int g=10-1;g>p;g--)
		{
			System.out.print(arr[g]+" ");
		}
	}
}
						
				