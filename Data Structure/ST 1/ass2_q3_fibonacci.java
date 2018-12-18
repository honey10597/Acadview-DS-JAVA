import java.util.*;
public class ass2_q3_fibonacci {
	static int find(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		else return find(n-1)+find(n-2);
	}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			 
			int n=sc.nextInt();
			
			System.out.println(find(n));
			
			}

	}
