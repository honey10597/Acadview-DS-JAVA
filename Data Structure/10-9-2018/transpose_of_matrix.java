import java.util.*;
class transpose_of_matrix {
  public static void main(String[] args) {
    int a[][]=new int[3][3];
    //a[][]={{1,2,3},{4,5,6},{7,8,9}};
    int br[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    for(int p=0;p<3;p++)
    {
      for(int q=0;q<3;q++)
      {
        int x=sc.nextInt();
        a[p][q]=x;
        System.out.print(a[p][q]+" ");
      }System.out.println("");
    }
    int t=0;
    for(int i=0;i<3;i++)
    {
      for(int j=i;j<3;j++)
      {
        t=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=t;
        //System.out.print(b[
          j][i]+" ");
      }   
    }System.out.println("");
    for(int b=0;b<3;b++)
    {
      for(int v=0;v<3;v++)
      {
        System.out.print(a
        [b][v]+" ");
      }
      System.out.println("");
    }
  }
}