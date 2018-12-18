import java.util.*;
class infix_to_prefix
{

  static int prec(char c)
  {
    switch(c)
    {
      case '+': 
      case '-':
         return 1;
      case '*':
      case '/':
         return 2;
      case '^':
         return 3;
    }
    return -1;
  }

  static String infixToPrefix(String s)
  {
    String r="";
    int i=0;
    Stack<Character> stack=new Stack<Character>();
    for(i=s.length()-1;i>=0;i--)
    {
      char ch=s.charAt(i);
      if(ch==')')
      {
        r+='(';
      }
      else if(ch=='(')
      {
        r+=')';
      }
      else{
        r+=ch;
      }
    }
    String t="";
    for(i=0;i<r.length();i++)
    {
      char c=r.charAt(i);
      if(Character.isLetterOrDigit(c))
      {
        t+=c;
      }
      else if(c=='(')
      {
        stack.push(c);
      }
      else if(c==')')
      {
        while(!stack.isEmpty() && stack.peek()!='(')
        {
          t+=stack.pop();
        }
        stack.pop();
      }
      else
      {
        while(!stack.isEmpty() && prec(c)<=prec(stack.peek()))
        {
          t+=stack.pop();
        }
        stack.push(c);
      }
    }
    while(!stack.isEmpty())
    {
      t+=stack.pop();
    }
    String result="";
    for(i=t.length()-1;i>=0;i--)
    {
      char x=t.charAt(i);
      if(x==')')
      {
        result+='(';
      }
      else if(x=='(')
      {
        result+=')';
      }
      else 
      result+=x;
    }
    return result;

  }

  public static void main(String args[])
  {
    String s="(A-B/C)*(A/K-L)";
    System.out.println(infixToPrefix(s));

  }
}

//        *-A/BC-/AKL