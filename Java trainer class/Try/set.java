import java.util.*;
public class set {
    public static void main(String args[]) {
        // Set<Student> s=new HashSet<>();
        // Set<Student> s=new LinkedHashSet<>();
        Set<Student> s=new TreeSet<>();
        for(int i=1;i<=5;i++)
        {
            s.add(new Student(i*10));
        }
        Iterator it=s.iterator();
        while(it.hasNext())
        {
            System.out.print(((Student)it.next()).getid()+" ");
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