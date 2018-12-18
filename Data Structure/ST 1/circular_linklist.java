import java.util.*;
public class circular_linklist {

	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    linklist l=new linklist();
		    node head=null;
		    int size=sc.nextInt();
		    for(int i=1;i<=size;i++)
		    {
		      head=l.insert(head,i*3);
		    }
		    l.display(head);
		  }
		}
		class node
		{
		  int data;
		  node next;
		  node(int data)
		  {
		    this.data=data;
		  }
		}
		class linklist
		{
		  public node insert(node head,int d)
		  {
		    node temp=new node(d);
		    if(head==null)
		    {
		      head=temp;
		      head.next=head;
		    }
		    else
		    {
		      node temp1=head;
		      while(temp1.next!=head)
		      {
		        temp1=temp1.next;
		      }
		      temp1.next=temp;
		      temp.next=head;
		    }
		    return head;
		  }
		  public void display(node head)
		  {
		    node t=head;
		    while(t.next!=head)
		    {
		      System.out.print(t.data+" ");
		      t=t.next;
		    }
		    System.out.print(t.data+" ");
		  }

		}