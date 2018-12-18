class Test
{
	 static int data;
	 //int data;
	 //float data;
	 //char data;
	 int b;
	/*public void setData(int x)
	{
		data=x;
	}
	public int getData(int x)
	{
		return data;
	}
	public void display()
	{
		System.out.println(data);
	}*/
	public void inc()
	{
		data++;
	}
	public static void fun()
	{
		system.out.println(data);
		Syatem.out.println(b);
}
public class demo
{
	public static void main(String x[])
	{
		Test t=new Test();
		t.fun();
	}
}