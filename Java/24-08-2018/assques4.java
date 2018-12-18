public class assques4
{
	public static void main(String x[])
	{
		twowheller t=new twowheller();
		fourwheller f=new fourwheller();
		t.start();
		t.stop();
		f.start();
		f.stop();
	}
}
abstract class vehicle
{
	abstract public void start();
	void stop()
	{
		System.out.println("vehicle stop");
	}
}
class twowheller extends vehicle
{
	public void start()
	{
		System.out.println("twowheller starts");
	}
	public void stop()
	{
		System.out.println("twowheller stops");
	}
}
class fourwheller extends vehicle
{
	public void start()
	{
		System.out.println("fourwheller starts");
	}
	public void stop()
	{
		System.out.println("fourwheller stops");
	}
}