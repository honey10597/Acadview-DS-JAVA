import java.util.*;
public class recarea1
{
	public static void main(String x[])
	{
		int length,breadth;
	    Scanner num=new Scanner(System.in);
	    System.out.println("enter length and breadth : ");
	    length=num.nextInt();
	    breadth=num.nextInt();
		rectangle obj1=new rectangle();
		obj1.calculatearea(length,breadth);
	}
}
class rectangle
{
	
	public void calculatearea(int length,int breadth)
	{
		System.out.println("area of rectangle is : "+(length*breadth));
	}
}
