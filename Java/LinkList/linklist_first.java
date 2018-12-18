package java_acadview;
import java.util.*;

public class linklist_first {

	public static void main(String[] args) {
		
		
		List<student> l=new java.util.ArrayList<>();
		
		List<student> l2=new java.util.ArrayList<>();
			
		int i=0;
		
		
		/*for(int i=1;i<=10;i++)
		{
			l.add(new student(i*10));// add is by default method it adds values.
		
		}
		
		l2.add(new student(110));
		
		l2.add(new student(112));
		
		l.addAll(l2);
		
		//l.remove(1);
		 */
		//l.add(new student(20));
		
//		System.out.println(l.remove(new student(20)));// only first occurance will be delete
//		
//		System.out.println(l.contains(new student(70)));
//		
//		System.out.println("size : "+l.size());
//		
//		System.out.println("is empty : "+l.isEmpty());
		
//		Iterator t=l.iterator();//accessing the elements one by one
		
		/*while(t.hasNext())    // does not allow modification
		{
			System.out.print(((student)t.next()).getid()+" ");
		}*/
		
		/*for(student s : l)
		{
			System.out.print(s.getid()+" ");
		}*/
		
//		ListIterator k=l.listIterator(/*l.size()-1*/);    //  ALLOW MODIFICATION
/*      
 * 
 *      System.out.println(" ");
		
		while(k.hasNext())
		{
			if(k.nextIndex()==5)
			{
				k.add(new student(911));
			}
			System.out.print((((student)k.next()).getid())+" ");
			
		}
		
		System.out.println(" ");

		while(k.hasPrevious())
		{
			System.out.print(((student)k.previous()).getid()+" ");
		}
		student s=new student(10);
		 System.out.println("\n"+s);       //HASHCODE
		
		
//		Set<student> se=new HashSet<>();                 // HASHSET
		
//		Set<student> se=new LinkedHashSet<>();           // LINKED HASHSET
		
/*		Set<student> se=new TreeSet<>();               	 //  TREESET
		
		
		for(int i=1;i<=5;i++)
		{
			se.add(new student(i*10));
		}
		
		for(student ss: se)
		{
			System.out.print(ss.getid()+" ");
		}
*/		
		
/*		List<student> lv=new Vector<>();                   // VECTOR
		for(i=1;i<=5;i++)
		{
			lv.add(new student(i*10));
		}
		for(student sv : lv)
		{
			System.out.print(sv.getid()+" ");
		}
		
	}
*/
		
		Map<String,student> lm=new HashMap<>();              // MAP
		
		char ch[] = {'a','b','c','d','e'};
		
		for(i=0;i<=4;i++)
		{
			lm.put(Character.toString(ch[i]),new student(i*10));
		}
		
		Set s=lm.entrySet();  // RETURN A SET THAT CONTAIN ELEMENT IN A MAP
		
		Iterator it=s.iterator();
		
		while(it.hasNext())
		{
			Map.Entry me = (Map.Entry)it.next();
			System.out.println(me.getKey()+" : "+((student)me.getValue()).getid());
		}
		
		
		Set keys=lm.keySet();    // TO GET ALL THE KEY THAT HASHMAP CONTAIN 
		
		it=keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		lm.put("abc", new student(101));
		
		lm.put("def", new student(102));
		
		System.out.println(lm.put("ghi",new student(103)));
		
		System.out.println(lm.get("ghi").getid());
		
		lm.put("ghi",new student(104));
		
		System.out.println(lm.get("ghi").getid());
		
		System.out.println("size : "+lm.size());
	
		System.out.println("contains key : "+lm.containsKey("ghi"));
		
		System.out.println("contains value : "+lm.containsValue(new student(101)));
		
		System.out.println("is empty : "+lm.isEmpty());
		
		System.out.println("clear method called.......");
		
		System.out.println("is empty : "+lm.isEmpty());
		
}
	
}
class student implements Comparable
{
	
	private int id;
	
	student()
	{
		this.id=-9999;
	}
	
	student(int id)
	{
		this.id=id;
	}
	
	public void setid(int id)//setter or mutator
	{
		this.id=id;
	}
	
	public int getid()//getter or accesor
	{
		return id;
	}
	
	public int hashCode()
	{
		return (id*10)+1;
	}
	

	public boolean equals(Object o)
	{
		student s=(student) o;
		if(id==s.getid())
			return true;	
		else
			return false;
	}
	
//	@override
	public int compareTo(Object t)
	{
		student s=(student) t;
		if(this.id==s.getid())
			return 0;
		else if(this.id==s.getid())
			return 1;
		else
			return -1;
	}
	
}

	