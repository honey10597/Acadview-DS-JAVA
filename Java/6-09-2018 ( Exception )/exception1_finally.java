class exception1_finally {
  public static void main(String[] args) {
    int a=5;
    int b=0;
    int c=0;
    try
    {
      c=a/b;
	 // c=a/2;
      System.out.println("inside try");
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    finally{
      System.out.println("inside finally");
    }
	System.out.println("hello world");
  }
}