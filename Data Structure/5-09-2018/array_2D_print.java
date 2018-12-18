import java.util.*;
class array_2D_print
{
  public static void main(String xx[])
  {
    Scanner sc=new Scanner(System.in);
    int i=0,j=0;
    int row=sc.nextInt();
    int col=sc.nextInt();
    int ar1[][]=new int[row][col];
    int ar2[][]=new int[row][col];
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        ar1[i][j]=sc.nextInt();
        ar2[i][j]=ar1[i][j];
      }
    }
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        System.out.print(ar2[i][j]+" ");
      }
    }
  }
}