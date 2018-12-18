import java.util.*;
public class ass1_q3_max_frequency {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count[]=new int[200];
		int cnt[]=new int[200];
		String s=sc.next();
		String stor="";
		int max=-999;
		for(int i=0;i<s.length();i++)
		{ 
			int st=s.charAt(i);//a=97
			count[st]+=1;//count[97]=1;
			if(count[st]>max)
			{
				stor="";
				max=count[st];
				stor=stor+s.charAt(i);
			}
		}
		int c[]=new int[200];
		for(int j=0;j<s.length();j++)
		{
			int ask=s.charAt(j);
			if(count[ask]==max && c[ask]==0)
			{
				c[ask]+=1;
				System.out.println(s.charAt(j)+" occurs maximum "+max);
			}
		}
		
		//System.out.println(stor+" occurs maximun "+max+" times");
	}

}
