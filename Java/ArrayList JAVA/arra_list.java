package java_acadview;

public class array_list {

	public static void main(String[] args) {
		arraylist a=new arraylist(5);
		
		for(int i=0;i<5;i++)
		{
			a.add(i*10);
		}
		a.add(60);
		a.dis();
	}
}
class arraylist
{
	private int x[],size;
	private int index;
	arraylist(int size)
	{
		x=new int[size];
		index=-1;
		this.size=size;
	}
	public void add(int data)
	{
		if(index==this.size-1)
		{
			int temp[]=x;
			size=size*2;
			x=new int[size];
			for(int i=0;i<=index;i++)
			{
				x[i]=temp[i];
			}
			index++;
			
			x[index]=data;
			
		}
		else
		{
			index++;
			x[index]=data;
		}
		
	}
	public void dis()
	{
		for(int j=1;j<size;j++)
		{
			System.out.print(x[j]+" ");
		}
	}
}
  