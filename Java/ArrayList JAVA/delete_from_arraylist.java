package java_acadview;

public class delete_from_arraylist {
	public static void main(String args[])
	{
		arylst a=new arylst(5);
		for(int i=0;i<5;i++)
		{
			a.add(i*5);
		}
		
		//System.out.println("enter the index on w/c u wnt to delete the element");
		//int pos=3;
		a.del(2);
		a.dis();
	}

}
class arylst
{
	private int ar[];
	private int index;
	private int size;
	private int de;
	arylst(int size)
	{
		this.size=size;
		index=-1;
		ar=new int[size];
	}
	public void add(int data)
	{
		if(index==this.size-1)
	    {
			int temp[]=ar;
			size=size*2;
			ar=new int[size];
			for(int i=0;i<=index;i++)
			{
				ar[i]=temp[i];
			}
			index++;
			ar[index]=data;
	    }			
		
		else
		{
			index++;
			ar[index]=data;
		}
		
	}
	public void del(int d)
	{
		
		for(int s=0;s<size;s++)
		{
			
			if(s==d)
			{
				for(int t=d;t<size-1;t++)
				{
					ar[t]=ar[t+1];
				}
			}
		}
	}
	public void dis()
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.print(ar[j]+" ");
		}
	}
}
