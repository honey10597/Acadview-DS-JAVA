package java_acadview;

public class exception_try {

	public static void main(String[] args) 
	{
		int a=5;
		int b=0;
		int c=0;
		try
		{
			c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
