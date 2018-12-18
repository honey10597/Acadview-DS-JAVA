

public class final_class {

	public static void main(String args[]) {
		base b=new base();
		b.show();
	}
}
final class base
{
	 void show()
	 {
		 System.out.print("final class which cannot be extended");
	 }
}