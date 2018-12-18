import java.util.*;
public class min_in_array
{
	public static void main(String xo[])
	{
		Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
		int arr[]=new int[size];
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	/*	for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}*/
    base b=new base();
    int m[]=b.array(arr);
    System.out.println(m);
	}
}
class base
{
  int min=999;int j=0;
  int[] array(int arr[])
  {
    for(j=0;j<arr.length;j++)
    {
      if(arr[j]<min)
      {
        min=arr[j];
      }
    }
    return min;
  }
}
/*
import java.util.*;
public class Main
{
	public static void main(String xo[])
	{
		Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
		int arr[]=new int[size];
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
    base b=new base();
    int m[]=b.array(arr);
    for(i=arr.length-1;i>=0;i--)
		{
			System.out.print(m[i]+" ");
		}
	}
}
class base
{
  int min=999;int j=0;
  int[] array(int arr[])
  {
    for(j=0;j<arr.length;j++)
    {
      if(arr[j]<min)
      {
        min=arr[j];
      }
    }
    return arr;
  }
}
*/
