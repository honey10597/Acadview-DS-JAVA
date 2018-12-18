import java.util.*;
public class selection_sort
{
    public static void sort(int ar[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(ar[j]<ar[min])
                {
                    min=j;
                }
            }
            int t=ar[i];
            ar[i]=ar[min];
            ar[min]=t;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ar[]={3,7,2,1,6};
        sort(ar,ar.length);
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}