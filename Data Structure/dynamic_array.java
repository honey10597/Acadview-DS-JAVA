import  java.util.*;
import java.lang.*;
import java.io.*;
public class dynamic_array {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int a[][]=new int[3][];
     a[0]=new int[3];
     a[1]=new int[2];
     a[2]=new int[4];
    int i=0,j=0;
    System.out.println("enter elements");
    for(i=0;i<3;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }

    for(i=0;i<3;i++)
    {
      for(j=0;j<a[i].length;j++)
      {
        System.out.print(a[i][j]+" ");
      }System.out.println("");
    }
  }
}