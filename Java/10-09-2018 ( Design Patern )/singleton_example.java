public class Main //school
{
  public static void main(String[] args) 
  {
    principle p1=principle.getprinci();
    System.out.println(p1.getname());
    System.out.println(p1.getage());
    System.out.println(p1.getquali());
    student s1=student.getstu();
    System.out.println(s1.getname());
        System.out.println(s1.getage());
    System.out.println(s1.getstand());


  }
}
class principle 
{
  private String name="Mohan das";
  private int age=50;
  private String quali="Phd.";
  private principle(){};
  private static principle p;
  public static principle getprinci()
  {
  if(p==null)
  {
   p=new principle();
    return p;
  }
  else
  {
    return p;
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
  public int getage()
  {
    return age;
  }
  public int setage(int age)
  {
    this.age=age;
    return age;
  }
  public String getquali()
  {
    return quali;
  }
  public String setquali()
  {
    this.quali=quali;
    return quali;
  }
}

class student 
{
  private String name="aman";
  private int age=15;
  private int standard=12;
  private static student s;

  private student(){};
  public static student getstu()
  {
    if(s==null)
    {
      s=new student();
      return s;
    }
    else
    return s;
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
  public int getage()
  {
    return age;
  }
  public int setage()
  {
    this.age=age;
    return age;
  }
  public int getstand()
  {
    return standard;
  }
  public int setstand(int standard)
  {
    this.standard=standard;
    return standard;
  }
}