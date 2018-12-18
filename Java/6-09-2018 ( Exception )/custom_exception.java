class custom_exception {
  public static void main(String[] args) {
    MyException e=new MyException();
    System.out.println(e);
	try
    {
      throw new MyException();
    }
    catch(MyException x)
    {
      System.out.println(x);
    }
    System.out.println("Hello world!");
  }
}
class MyException extends Exception
{
  public String toString()
  {
    return "MyException Object";
  }
}