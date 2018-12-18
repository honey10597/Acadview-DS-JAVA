package java_acadview;
import java.util.*;
public class java_st2_5_mark_ques {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		int i=0;
	
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		for(i=1;i<=size;i++)
		{
			al.add(sc.nextInt());
		}
		
		for(i=0;i<al.size()-1;i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i)==al.get(j))
				{
					al.remove(j);
				}
			}
		}
		
			System.out.print(al);
		
		
	}

}
