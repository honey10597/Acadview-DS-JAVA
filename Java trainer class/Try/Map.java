import java.util.*;
public class Map {
    public static void main(String args[]) {
       
       Map<Integer,Student> m=new HashMap<>();
       
       for(int i=0;i<5;i++)
       {
           m.put(i,new Student(i*10));
       }
       
       Set s=m.entrySet();
       
       Iterator it=s.iterator();
       while(it.hasNext())
       {
           Map.Entry me=(Map.Entry)it.next();
           System.out.println(me.getKey()+" : "+((Student)me.getValue()).getid());
       }
       Set k=m.keySet();
       
       Iterator itt=k.iterator();
       
       while(itt.hasNext())
       {
           System.out.println(itt.next());
       }
	
		
    }
}
class Student implements Comparable
{
    private int id;
    Student(int id)
    {
        this.id=id;
    }
    public void setid(int d)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }
    public boolean equals(Object o)
    {
        Student s=(Student) o;
        if(id==s.getid())
           return true;
        else
           return false;
    }
    public int compareTo(Object t)
    {
        Student st=(Student) t;
        if(this.id<st.getid())
          return 0;
        else if(this.id==st.getid())
          return 1;
        else
          return -1;
    }
}