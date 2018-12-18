import java.util.*;
public class array2d
 {
  public static void main(String args[]) 
  {
  int a[][]=new int[5][5];
  int x[]=new int[5];
  int avg[]=new int[5];
  x[0]=0;
    //int[][] multi = new int[5][];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter marks ");
    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
      {
        int xx=sc.nextInt();
        a[i][j]=xx;
		x[i]=x[i]+a[i][j];
      }
    }
 /* for(int p=0;p<5;p++)
  {
    for(int q=0;q<5;q++)
    {
      System.out.print(a[p][q]+" ");
    }
  }*/
  for(int y=0;y<5;y++)
  {
	  int g=x[y]/5;
	  avg[y]=g;
  }
  System.out.print("\n");
  for(int y=0;y<5;y++)
  {
	  System.out.println("average marks of "+(y+1)+"st student is "+avg[y]);
  }
}
 }
 