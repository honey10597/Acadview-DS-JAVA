import java.util.*;
public class ass2_q5_string_int_count {
	static int find(int n)
	{
		if(n<=0)
	  return 0;
	  else
	  {
	    return (n%10 + find(n/10));
	  }
	}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no.");
			String s=sc.next();
			//System.out.println(s.length());
			sc.close();
	        int r=0;
			int n=Integer.parseInt(s);
			System.out.println(find(n));
		}

	}
