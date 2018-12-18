import java.util.*;
public class linklist_return {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    linklist2 l=new linklist2();
    int size=sc.nextInt();
    int i=0;
    node2 head=null;
     for(i=1;i<=size;i++)
     {
         head=l.insert(head,i);
     }
     l.display(head);
  }
}
class node2
{
  int data;
  node2 next;
  node2(int d)
  {
    data=d;
  }
}
class linklist2
{
  public node2 insert(node2 head,int d)
  {
    node2 temp=new node2(d);
    if(head==null)
    {
      head=temp;
    }
    else
    {
      node2 temp1=head;
      while(temp1.next!=null)
      {
        temp1=temp1.next;
      }
      temp1.next=temp;
    }
    return head;
  }
  public void display(node2 head)
  {
      node2 t=head;
      while(t!=null)
      {
          System.out.print(t.data+" ");
          t=t.next;
      }
  }
}