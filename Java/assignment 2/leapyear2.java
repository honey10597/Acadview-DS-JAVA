import java.util.*;
public class leapyear2
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%4==0)
			System.out.println("leapyear");
		else
			System.out.println("not");
	}
}