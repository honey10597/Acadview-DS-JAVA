import java.util.*;
public class merging_sorted_array {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter size of first array");
    int size1=sc.nextInt();
    int a[]=new int[size1];
    sorted s=new sorted();
    int array1[]=s.first_array(a,size1);
    System.out.println("enter size of second array");
    int size2=sc.nextInt();
    int b[]=new int[size2];
    int array2[]=s.second_array(b,size2);
    int sort[]=new int[size1+size2];
    int k=0;
    for(k=0;k<size1;k++)
    {
      sort[k]=array1[k];
      
    }
    int zz=size1;
    for(k=0;k<size2;k++)
    {
      sort[zz]=array2[k];
      zz++;
    }
    int i=0,j=0,temp=0;
    for(i=0;i<(size1+size2);i++)
    {
      for(j=i;j<(size1+size2);j++)
      {
        if(sort[i]>sort[j])
        {
          temp=sort[i];
          sort[i]=sort[j];
          sort[j]=temp;
        }
      }
    }
    System.out.println("Sorted array after merging is : ");
    for(i=0;i<(size1+size2);i++)
    {
      System.out.print(sort[i]+" ");
    }
  }
}
class sorted
{
  Scanner scan=new Scanner(System.in);
  int[] first_array(int a[],int size1)
  {
    System.out.println("enter element of first array");
    for(int i=0;i<size1;i++)
    {
      a[i]=scan.nextInt();
      
    }
    return a;
  }
  

  int[] second_array(int b[], int size2)
  {
    System.out.println("enter element of first array");

    for(int j=0;j<size2;j++)
    {
      b[j]=scan.nextInt();
     // System.out.println(b[j]+" ");
    }
    return b;
  }
}