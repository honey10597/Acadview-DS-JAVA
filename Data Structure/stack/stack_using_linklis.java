public class stack_using_linklist {
    public static void main(String args[]) {
        stack s=new stack();
        for(int i=1;i<=5;i++)
        {
            s.push(i*10);
        }
        s.pop();
        s.display();
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
class stack
{
    node head;
    public void push(int d)
    {
        node temp=new node(d);
        if(head==null)
        {
            head=temp;
        }
        else
        {
           node tempx=temp;
           tempx.next=head;
           head=tempx;
        }
    }
    public void pop()
    {
        node temp2=head;
        while(temp2.next.next!=null)
        {
            temp2=temp2.next;
        }
        temp2.next=null;
    }
    public void display()
    {
        node temp2=head;
        while(temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }
    }
}