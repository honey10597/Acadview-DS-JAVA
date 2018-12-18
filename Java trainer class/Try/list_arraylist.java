import java.util.*;
public class list_arraylist {
    public static void main(String args[]) {
        List<Student> l=new java.util.ArrayList<>();
        int i=0;
        for(i=1;i<6;i++)
        {
            l.add(new Student(i*10));
        }
        // for(Student o:l)
        // {
        //     System.out.print(o.getid()+" ");
        // }
        // System.out.print(l.getid()+" ");
        // l.remove(2);  
        System.out.println(l.remove(new Student(20)));
        System.out.println(l.contains(new Student(40)));
        // Iterator it=l.iterator();
        // while(it.hasNext())
        // {
        //     System.out.print(((Student)it.next()).getid()+" ");
        // }
        
        ListIterator li=l.listIterator(l.size()-1);
        while(li.hasPrevious())
        {
            System.out.print(((Student)li.previous()).getid()+" ");
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
        if(this.id>st.getid())
          return 0;
        else if(this.id==st.getid())
          return 1;
        else
          return -1;
    }
}