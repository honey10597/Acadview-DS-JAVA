import java.util.*;
public class linklist_first {

    public static void main(String xxx[])
    {
        linklist l=new linklist();
        int i=0;
        for(i=1;i<=5;i++)
        {
            l.insert(i*10);
        }
//        l.ins_beg(911);  // insert 911 in beagning
//        l.ins_pos(20,777);  // insert 777 after 20
        l.rev();
        l.del(30);            //  insert 30 from linklist
        l.middle();
        l.remove_duplicates();
        l.display();
    }
    
}
class node
{
    int data;
    node next;
    node(int d)
    {
    	data=d;
    }
}
class linklist
{
    node head;
   
    
    public void insert(int d)
    {
        node temp=new node(d);
        node temp2=head;
        if(head==null)
        {
           head=temp;
        }
        else
        {
            
            while(temp2.next!=null)
            {
                temp2=temp2.next;
            }
            temp2.next=temp;
        }
    }
  
    
    /* public void display()
    {
        node temp3=head;
        while(temp3!=null)
        {
            System.out.print(temp3.data+" ");
            temp3=temp3.next;
        }
    }*/
   
    
    /* public void ins_beg(int d)
    {
    	node temp4=new node(d);
    	node tempb=temp4;
    	tempb.next=head;
    	head=tempb;
    }*/
    
  
    
    /* public void ins_pos(int p,int d)
    {
    	node tempins=new node(d);
    	node tempp=head;
    	node tem;
    	while(tempp!=null)
    	{
    		if(tempp.data==p)
    		{
    	        tem=tempins;//777
    			tem.next=tempp.next;
    			tempp.next=tempins;
    		}
    		tempp=tempp.next;
    	}
    }*/
    
   
    public void del(int zax)
    {
    	node tempd=head;
    	while(tempd.next!=null)
    	{
    		if(tempd.next.data==zax)
    		{
    			tempd.next=tempd.next.next;
    		}
    		tempd=tempd.next;
    	}
    }
    
    public void remove_duplicate()
    {
    	node ptr1=null,ptr2=null;
    	while(ptr1!=null && ptr1.next!=null)
    	{
    		ptr2=ptr1;
    		while(ptr2!=null)
    		{
    			if(ptr1.data==ptr2.data)
    			{
    				ptr1.next=ptr2.next.next;
    			}
    			ptr2=ptr2.next;
    		}
    		ptr1=ptr1.next;
    	}
    }
    
    public void middle()
    {
      node fast=head;
      node slow=head;
      while(fast.next!=null && slow!=null)
      {
        fast=fast.next.next;
        slow=slow.next;
      }
      System.out.println(slow.data);
    }
    
    public void rev() //   reverse of linklist
    {
    	node prev=null;
    	node current=head;
    	node tempre=null;
    	while(current!=null)
    	{
    		tempre=current.next;
    		current.next=prev;
    		prev=current;
    		current=tempre;
    	}
    	head=prev;
    }
    
  
    public void display()
    {
        node tempr=head;
        while(tempr!=null)
        {
            System.out.print(tempr.data+" ");
            tempr=tempr.next;
        }
    }
}
