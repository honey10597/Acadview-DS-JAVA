class nesting_try_catch {
  public static void main(String[] args) 
  {
    int a=5;
    int b=0;
    int c=0;
    int y[]=new int[5];
    try
    {
     c=a/b;
      try
      {
        System.out.println(y[10]);
      }
      catch(ArrayIndexOutOfBoundsException f)//array index out 
      {
        System.out.println(f);
      }      
    }
    catch(Exception e)// / by o
    {
      System.out.println(e);
    }
    System.out.println("Hello world!");
  }
}