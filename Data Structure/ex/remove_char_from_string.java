import java.util.*;
public class remove_char_from_string {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s="hello";
        char ch=sc.next().charAt(0);
        String q="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=ch)
            {
                q=q+s.charAt(i);
            }
        }
        System.out.println(q);
    }
}
