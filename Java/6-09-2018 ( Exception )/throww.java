class throww {
  public static void main(String[] args) {
    int a=5;
    int b=0;
    int c=0;
    try
    {
     throw new ArithmeticException();
      //System.out.println("inside try");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally
	{
      System.out.println("inside finally");
    }
    System.out.println("Hello World");
  }
}