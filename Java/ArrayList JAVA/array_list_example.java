//package java_acadview;

public class array_list_example {

	public static void main(String[] args) 
	{
		arraylis a=new arraylis(5);
		for(int i=0;i<5;i++)
		{
			a.add(i*10);
		}
		a.add(50);
		a.dis();
	}

}
class arraylis
{
	private int arr[];
	private int size;
	private int index;
	arraylis(int size)
	{
		arr=new int[size];
		this.size=size;
		index=-1;
	}
	public void add(int data)
	{
		if(index==size-1)
		{
			int temp[]=arr;
			size=size*2;
			arr=new int[size];
			for(int i=0;i<=index;i++)
			{
				arr[i]=temp[i];
			}
			index++;
			arr[index]=data;
		}
		else
		{
			index++;
			arr[index]=data;
		}
	}
	public void dis()
	{
		for(int j=0;j<size;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
