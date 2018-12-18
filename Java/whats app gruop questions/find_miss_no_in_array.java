import java.util.*;
public class find_miss_no_in_array
{
	public static void main(String xx[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("how many no. u want to enter :- ");
		int num=sc.nextInt();
		System.out.println(" ");
		
		int a[]=new int[num];
    int arr[]=new int[100];
    int miss[]=new int[num];
		System.out.println("enter "+num+" numbers starting from 1 in sequence order");
    int last=0;
		for(int i=0;i<num;i++)
		{
			int n=sc.nextInt();
			a[i]=n;
      last=n;
		}

	  for(int f=0;f<last;f++)
    {
      arr[f]=f+1;
    }

    int u=0;
    
    System.out.println(" ");
    
    
    System.out.print(" number enter in array is : ");
    
    for(int d=0;d<num;d++)
    {
      System.out.print(a[d]+" ");
    }
    System.out.println(" ");
  System.out.print("missing no. between 1 to "+num+" is ");
		int z=a[0];
    for(int y=0;y<num;y++)
		{
      if(a[y]!=z)
      {
        System.out.print(z+" ");
        y--;
        z++;
      }
      else 
      z++;
		}
	}
}