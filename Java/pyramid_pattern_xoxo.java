 class pyramid_pattern_xoxo {
  public static void main(String[] args) {
    int i=0,j=0,k=0,p=0;
    for(i=5;i>=1;i--)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(" ");
      }
      for(k=5;k>=i;k--)
      {
        System.out.print(" *");
      }
      System.out.println(" ");
    }
  }
 }
 