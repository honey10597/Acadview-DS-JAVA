import java.util.*;
import java.lang.*;
class find_kth_greatest
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many no. u want to enter in an array\n");
    int num=sc.nextInt();
    int a[]=new int[num];
    int i=0,max=-999;
    for(i=0;i<num;i++)
    {
      a[i]=sc.nextInt();
    }
    int temp=0;
   
    for(i=0;i<num;i++)
    {
      for(int j=i;j<num;j++)
      {
        if(a[i]<a[j])
        {
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(i=0;i<num;i++)
    {
      System.out.println(a[i]+" ");
    }
     System.out.println("which largest no. u want to enter from an array of elements "+num);
    int k=sc.nextInt();
    System.out.println(a[k-1]);
  }
}