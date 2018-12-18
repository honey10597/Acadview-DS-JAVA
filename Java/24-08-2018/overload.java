import java.util.*;
public class overload
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		float b=sc.nextFloat();
		derived d=new derived();
		d.print();
		d.print(a);
		d.print(b);
	}
}
class derived
{
	void print()
	{
		System.out.println("this function accept null values");
	}
	void print(int a)
	{
		System.out.println("this function accept int & float values : "+a);
	}
	void print(float b)
	{
		System.out.println("this function accept float value : "+b);
	}
}
