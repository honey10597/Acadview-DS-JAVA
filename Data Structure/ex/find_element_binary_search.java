import java.util.*;
public class find_element_binary_search
{
    static int find(int ar[],int d,int f,int l)
    {
        if(l>=f)
        {
            int mid=(f+l)/2;
            
            if(ar[mid]==d)
             return mid;
             
            else if(ar[mid]>d)
             return find(ar,d,f,mid-1);
            
            return find(ar,d,mid+1,l);
             
        }
        return -1;
    }
    static void sort(int ar[])
    {
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]>ar[j])
                {
                    int t=ar[i];
                    ar[i]=ar[j];
                    ar[j]=t;
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ar[]=new int[t];
        int i=0;
        for(i=0;i<t;i++)
        {
            ar[i]=sc.nextInt();
        }
        
        
        sort(ar);
        
        int d=find(ar,ele,0,ar.length);
        
        System.out.println(d);
        // for(i=0;i<t;i++)
        // {
        //     System.out.print(ar[i]+" ");
        // }
    }
}