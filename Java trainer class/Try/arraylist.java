import java.util.*;
public class arraylist {
    public static void main(String args[]) {
        Arraylist al=new Arraylist(5);
        for(int i=0;i<;i++)
        {
            al.add(i*10);
        }
        al.display();
    }
}
class Arraylist
{
    private int index;
    int ar[];
    private int size;
    Arraylist(int size)
    {
        this.size=size;
        ar=new int[size];
        index=-1;
    }
    public void add(int d)
    {
        if(index==size-1)
        {
            int temp[]=ar;
            this.size=size*2;
             ar=new int[size];
            for(int i=0;i<temp.length;i++)
            {
                ar[i]=temp[i];
            }
            ar[++index]=d;
        }
        else
        {
            ar[++index]=d;
        }
    }
    public void display()
    {
        int i=0;
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}