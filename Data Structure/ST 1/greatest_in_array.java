import java.util.*;
public class greatest_in_array {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		int freq[]=new int[100];
		int i=0;
		int dup=a;
		while(dup>0)
		{
			switch(dup%10)
			{
				case 0: freq[0]+=1; break;
				case 1: freq[1]+=1; break;
				case 2: freq[2]+=1; break;
				case 3: freq[3]+=1; break;
				case 4: freq[4]+=1; break;
				case 5: freq[5]+=1; break;
				case 6: freq[6]+=1; break; 
				case 7: freq[7]+=1; break; 
				case 8: freq[8]+=1; break;
				case 9: freq[9]+=1; break;
			}
			dup=dup/10;
		}
		for(i=freq.length-1;i>=0;i--)
		{
			if(freq[i]!=0)
			{
				System.out.println(i);
			}
		}
	}

}
