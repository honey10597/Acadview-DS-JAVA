import java.util.*;
public class queue_try {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        queue q=new queue();
        int i=0;
        for(i=1;i<=2;i++)
        {
            q.enque(i);
        }
        q.deque();
        q.display();
    }
}
class queue
{
    int front,rear;
    int ar[];
    queue()
    {
        front=rear=-1;
        ar=new int[10];
    }
    public void enque(int d)
    {
        if(rear==ar.length-1)
        System.out.println("underflow");
        else
        ar[++rear]=d;
    }
    public void deque()
    {
        if(rear==-1)
        System.out.println("empty");
        front=front+1;
    }
    public void display()
    {
        int i=0;
        for(i=front+1;i<=rear;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    
}
