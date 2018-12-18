import java.util.*;
public class ass2_q2_array_reverse {
	static int[] find(int ar[],int size,int i)
	  {
	    if(size==i || i>size)
	    {
	    	return ar;
	    }
    else
    {
      int t=ar[i]; ;
      ar[i]=ar[size];
      ar[size]=t;
      i=i+1;
      
    }
     return  find(ar,size-1,i);
    
	  }
	  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter size of array");
	    int size=sc.nextInt();
	    System.out.println("enter elements in array");
	    int ar[]=new int[size];
	    int i=0;
	    for(i=0;i<size;i++)
	    {
	      ar[i]=sc.nextInt();
	    }
	    sc.close();
          i=0;
	    int[] rev=find(ar,size-1,i);
	   for(i=0;i<size;i++){
	   System.out.print(rev[i]+" ");}
	  }
	}
