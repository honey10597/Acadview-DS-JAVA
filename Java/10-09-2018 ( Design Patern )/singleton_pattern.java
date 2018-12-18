public class singleton_pattern {
  public static void main(String[] args) {
    lion l1=lion.getlion();
    System.out.println(l1.getname());
    lion l2=lion.getlion();
    System.out.println(l2.getname());
    if(l1==l2)
    {
      System.out.println("true");
    }
  }
}
class lion
{
  private String name="sheru";
  private static lion l;
  private lion(){}

  public static lion getlion()
  {
    if(l==null)
    {
      l=new lion();
      return l;
    }
    else
    {
      return l;
    }
  }
  public String getname()
  {
    return name;
  }
  public String setname(String name)
  {
    this.name=name;
    return name;
  }
}