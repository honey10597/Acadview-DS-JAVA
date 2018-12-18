import java.util.*;
class sum_2D_array
{

static int[][] returnarray(int ar1[][],int ar2[][],int ar3[][],int row,int col)
  {
    int i=0,j=0;
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        ar3[i][j]=ar1[i][j]+ar2[i][j];
      }
    }
    return ar3;
  }

  public static void main(String xx[])
  {
    Scanner sc=new Scanner(System.in);
    int i=0,j=0;
    int row=sc.nextInt();
    int col=sc.nextInt();
    int ar1[][]=new int[row][col];
    int ar2[][]=new int[row][col];
    int ar3[][]=new int[row][col];
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        ar1[i][j]=sc.nextInt();
      }
    }
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        ar2[i][j]=sc.nextInt();
      }
    }
     ar3=returnarray(ar1,ar2,ar3,row,col);
     for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        System.out.print(ar3[i][j]+" ");
      }
    }
  }
  
}