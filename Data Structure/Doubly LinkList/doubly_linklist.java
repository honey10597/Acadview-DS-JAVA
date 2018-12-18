package doubly_ll;
import java.util.*;
public class doubly_linklist {

	public static void main(String[] args) {
		doub_ll dl=new doub_ll();
		node head=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("entre size");
		int size=sc.nextInt();
		System.out.println("enter elements");
		for(int i=1;i<=size;i++)
		{
			head=dl.insert(head,sc.nextInt());
		}
//		head=dl.insert_at_beg(head,911);
		head=dl.delete(head,3);
//		head=dl.reverse(head);
		head=dl.reverse(head);
		dl.display(head);
	}
}
class node
{
	node next;
	node prev;
	int data;
	node(int data)
	{
		this.data=data;
	}
}

class doub_ll
{
	public node insert(node head,int d)
	{
		node temp=new node(d);
		if(head==null)
		{
			head=temp;
		}
		else {
			node temp1=head;
			while(temp1.next!=null)
			{
				temp1=temp1.next;
			}
			temp1.next=temp;
			temp.prev=temp1;
		}
		return head;
	}
	/*public node insert_at_beg(node head,int data)
	{
		node temp3=new node(data);
		node temp4=temp3;
		temp4.next=head;
		head.prev=temp4;
		head=temp4;
		return head;
	}*/
	public node delete(node head,int d)
	{
		 node temp5=head;
		    if(head.data==d)
		    {
		      head=temp5.next;
		    }
		    while(temp5.next!=null)
		    {
		      if(temp5.data==d)
		      {
		        if(temp5.data==head.data)
		        {
		          head=temp5.next;
		        }
		        else
		        {
		          temp5.prev.next=temp5.next;
		          temp5.next.prev=temp5;
		        }
		      }
		      temp5=temp5.next;
		    }
		    return head;
	}
	
	
	
	 public node reverse(node head)
	  {
	    node current=head;
	    node tempre=null;
	    node pre=null;
	    node hold=null;
	    while(current!=null)
	    {
	      tempre=current.next;
	      hold=current.prev;
	      current.next=pre;
	      pre=current;
	      pre.prev=hold;
	      current=tempre;
	    }
	    head=pre;
	    return head;
	  }
	
	public void display(node head)
	{
		node temp2=head;
		while(temp2!=null)
		{
			System.out.print(temp2.data+" ");
			temp2=temp2.next;
		}
	}
}