import java.util.*;
public class foreach
{
	public static void main(String xx[])
	{
		Scanner sc=new Scanner(System.in);
		int x[]=new int[5];
	   for(int i:x)
	     {
			 int a=sc.nextInt();
			 i=a;
		    System.out.print(i+" ");
	     }
	}
}