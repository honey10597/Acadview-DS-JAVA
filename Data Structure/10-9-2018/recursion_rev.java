class recursion_rev {
  static int rev(int n)
  {
    if(n==0)
    return 1;
    else
    {
      System.out.println(n);
      return rev(n-1);
    }
  }
  public static void main(String[] args) 
  {
    int n=10;
     int y=rev(n);
     System.out.println(y);
  }
}