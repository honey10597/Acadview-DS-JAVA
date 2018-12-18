class base_throww {
  public static void main(String[] args) {
    demo d=new demo();
    try
    {
      d.fun();
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }
    System.out.println("hello World");
  }
}
class demo
{
  public void fun() throws ArithmeticException
  {
    int c=5/0;
  }
}