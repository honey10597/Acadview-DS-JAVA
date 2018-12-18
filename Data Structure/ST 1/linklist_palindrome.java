import java.util.*;

public class linklist_palindrome {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int i=0;
    linklist1 l=new linklist1();
     System.out.println("enter size of linklist");
     int size=sc.nextInt();
      System.out.println("enter elements");
    for(i=1;i<=size;i++)
    {
      int a=sc.nextInt();
      l.insert(a);
    }
    l.rev();
    l.newlist();
    l.display();
   l.check();
  }
}

class node1
{
  int data;
  node1 next;
  node1(int d)
  {
    data=d;
  }
}

class nnode
{
  int da;
  nnode ne;
  nnode(int p)
  {
    da=p;
  }
}

class linklist1
{
  node1 head;
 public void insert(int d)
 {
   node1 temp=new node1(d);
   if(head==null)
   {
     head=temp;
   }
   else
   {
     node1 temp1=head;
     while(temp1.next!=null)
     {
       temp1=temp1.next;
     }
     temp1.next=temp;
   }
 }

public void rev()
{
  node1 current=head;
  node1 prev=null;
  node1 t=null;
  while(current!=null)
  {
    t=current.next;
    current.next=prev;
    prev=current;
    current=t;
  }
  head=prev;
}

nnode h; 

public void newlist()
{
  node1 te=head;
   
  while(te!=null)
  {
    nnode t1=new nnode(te.data);
    if(h==null)
    {
      h=t1;
    }
    else
    {
      nnode t2=h;
      while(t2.ne!=null)
      {
        t2=t2.ne;
      }
      t2.ne=t1;
    }


    te=te.next;
  }
}


   public void display()
   {


      node1 c=head;
  node1 p=null;
  node1 tx=null;
  while(c!=null)
  {
    tx=c.next;
    c.next=p;
    p=c;
    c=tx;
  }
  head=p;



     node1 temp2=head;
     while(temp2!=null)
     {
       System.out.print(temp2.data+" ");
       temp2=temp2.next;
     }
     
     System.out.println("");

     nnode t=h;
     while(t!=null)
     {
       System.out.print(t.da+" ");
       t=t.ne;
     }

   }

   public void check()
   {
     int f=0;
     node1 q1=head;
     nnode w1=h;
     while(q1!=null && w1!=null)
     {
       f=0;
       if(q1.data!=w1.da)
       {
         f=1;
         break;
       }
       q1=q1.next;
       w1=w1.ne;
     }
     if(f==1)
     {
        System.out.println("\nnot Palindrome");
     }
     else
      System.out.println("\nPalindrome");
   }



}