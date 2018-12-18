package java_acadview;

import java.util.*;

public class compare_2_set_retrn_same_element {

	public static void main(String[] args) {
		
		
		 List<employee> e=new java.util.ArrayList<>();
		  int i=0;
		 
		  /*e.add(new employee(911));

		  List<employee> s=new java.util.ArrayList<>();
		  s.add(new employee(777));
		  s.add(new employee(888));
		  e.addAll(s);
		  */
		  // e.remove(new employee(30));
		  
		  // Iterator it=e.iterator();
		  // while(it.hasNext())
		  // {
		    // System.out.print(((employee)it.next()).getid()+" ");
		  // }
		  // ListIterator li=e.listIterator();
		  // while(li.hasNext())
		  // {
		    // if(li.nextIndex()==2)
		    // {
		      // li.add(new employee(001));
		    // }
		    // System.out.print((((employee)li.next()).getid())+" ");
		  // }
		  
		    //  Set<employee> sh=new HashSet<>();
		    //  Set<employee> sh=new LinkedHashSet<>();
		     Set<employee> sh=new TreeSet<>();
		     Set<employee> sh2=new TreeSet<>();
 
		      for(i=1;i<=5;i++)
		      {
		        sh.add(new employee(i*10));
		      }
		      

		      
		      for(i=3;i<=5;i++)
		      {
		        sh2.add(new employee(i*6));
		      }

		      System.out.println(sh.containsAll(sh2));

		     /* for(employee em:sh)
		      {
		    	  System.out.print(em.getid()+" ");
		      }
		      System.out.print("\n");
		      
		      for(employee em2:sh2)
		      {
		    	  System.out.print(em2.getid()+" ");
		      }

		      System.out.print("\n");
		      
		  for(employee em:sh)
		  {
		    // System.out.print(em.getid()+" ");
		      
		      for(employee em2:sh2)
		  {
		         if(em.getid()==em2.getid()) 
		    System.out.print(em2.getid()+" ");
		  }

		  }*/

		      /*sh.retainAll(sh2);   // ONLY SAME ELEMENTS OF TWO SET ARE RETAIN
		      
		      for(employee em2:sh)
		      {
		    	  System.out.print(em2.getid()+" ");
		      }*/
		      
		      
		      
	}

}



class employee implements Comparable
{
  int id;
  
  employee()
  {
    this.id=-999;
  }
  employee(int id)
  {
    this.id=id;
  }
  public void setid(int id)
  {
    this.id=id;
  }
  public int getid()
  {
    return id;
  }
  public boolean equals(Object o)
  {
    employee e=(employee) o;
    if(id==e.getid())
    return true;
    else 
    return false;
  }

  public int compareTo(Object o)
  {
    employee ec=(employee) o;
    if(id==ec.getid())
    return 0;
    else if(id>ec.getid())
    return 1;
    else return -1;
  } 


}
