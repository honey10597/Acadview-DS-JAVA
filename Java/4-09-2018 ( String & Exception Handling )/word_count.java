import java.util.*;
public class word_count
{
	public static void main(String xo[])
	{
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int c=0;
    for(int i=0;i<s1.length();i++)
    {
      if(s1.charAt(i)==' ')
      {
        c++;
      }
    }
    System.out.println("no. of words in string is : "+(++c));
  }
}