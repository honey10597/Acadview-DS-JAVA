import java.util.*;
public class remove_duplicates_from_arraylist {
    public static void main(String args[]) {
        ArrayList<Object> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(10);
        al.add(30);
        al.add(10);
        
        Set<Object> s=new LinkedHashSet<>(al);
        al.clear();
        al.addAll(s);
        System.out.print(al);
    }
}
