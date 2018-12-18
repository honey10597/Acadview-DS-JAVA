import java.util.*;
import java.lang.*;
import java.io.*;
public class ass1_q2_toggle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
    String t="";
    String temp="";
		for(int i=0;i<s.length();i++)
		{
      temp="";
			if(s.charAt(i)>=65 && s.charAt(i)<=91)
			{
        char a=s.charAt(i);
        temp=temp+a;
        temp=temp.toLowerCase();
        t=t+temp;
			}
      if(s.charAt(i)>=97 && s.charAt(i)<=124)
      {
        char b=s.charAt(i);
        temp=temp+b;
        temp=temp.toUpperCase();
        t=t+temp;
      }
		}
    System.out.println(t);
	}

}
