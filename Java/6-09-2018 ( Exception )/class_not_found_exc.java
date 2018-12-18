class class_not_found_exc {
  public static void main(String[] args) 
  {
    demo d=new demo();
    try
    {
      d.fun();
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    System.out.println("Hello world!");
  }
}
class demo
{
  public void fun() throws ClassNotFoundException
  {
    throw new ClassNotFoundException();
  }
}