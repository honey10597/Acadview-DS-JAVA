import java.util.Scanner;


public class string_freq_remove {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s2="";
		char dup[]=s.toCharArray();
		int f=0;
		int i=0,j=0;
		for(i=0;i<s.length();i++)
		{ f=0;
		//System.out.println(s2);
			for(j=i+1;j<dup.length;j++)
			{
				if(s.charAt(i)==dup[j])
				{
					f=1;
					break;
				}
				else
					f=0;
			}
			if(f==0) {
				s2=s2+s.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
