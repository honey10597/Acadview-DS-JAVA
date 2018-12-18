
import java.util.*;
public class ass2_q1_array_find {
	static boolean find(int ar[],int d,int temp,int size)
	{

		if(temp==size)
			return false;
		if(ar[temp]==d)
			return true;
			else
				temp=temp+1;
				return find(ar,d,temp,size);
				
		 
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int ar[]=new int[size];
		int i=0;
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		i=0;
		int find=sc.nextInt();
		sc.close();
		boolean  t=find(ar,find,i,size);
		System.out.println(t);
	}

}

