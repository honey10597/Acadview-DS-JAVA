import java.util.*;
public class factory_pattern_fastfood 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    fastfood f;
    String name=sc.nextLine();
    f=fastfoodcenter.getname(name);
    f.deliver();
  }
}

abstract class fastfood
{
  String name;
  public void prepare()
  {
    System.out.println("food is preparing");
  }
  public void fry()
  {
    System.out.println("food is in oil");
  }
  public void serve()
  {
    System.out.println("food is ready");
  }
  abstract public void deliver();
}
class fastfoodcenter
{
  static fastfood f;
  public static fastfood getname(String name)
  {
    if(name.equals("spring roll"))
    f=new springroll(name);
    if(name.equals("momos"))
    f=new momos(name);
    if(name.equals("chowmin"))
    f=new chowmin(name);
    return f;
  }
}
class springroll extends fastfood
{
  String name;
  springroll(String name)
  {
    this.name=name;
  }
  public void deliver()
  {
    prepare();
    fry();
    serve();
    System.out.println(name+" is ready ");
  }
}
class momos extends fastfood
{
  momos(String name)
  {
    this.name=name;
  }
  public void deliver()
  {
    prepare();
    fry();
    serve();
    System.out.println(name+" is ready");
  }
}

class chowmin extends fastfood
{
  chowmin(String name)
  {
    this.name=name;
  }
  public void deliver()
  {
    prepare();
    fry();
    serve();
    System.out.println(name+" is ready");
  }
}
