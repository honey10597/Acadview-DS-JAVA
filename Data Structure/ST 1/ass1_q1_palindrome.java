import java.util.*;
import java.lang.*;
public class ass1_q1_palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string : ");
		String s=sc.next();
		checkfun c=new checkfun();
		boolean ch=c.check(s);
		if(ch==true)
		{
			System.out.println("String is palindrome");
		}
		else
			System.out.println("not palindrome");
	}
}
class checkfun
{
	boolean check(String s)
	{
		StringBuilder b=new StringBuilder(s);
    b.reverse();
    int flag=0;
    for(int j=0;j<s.length();j++)
    {
      if(s.charAt(j)!=b.charAt(j))
      {
        flag=1;
        break;
      }
      else
      flag=0;
    }
    if(flag==0)
    return true;
    else
    return false;
	}
}