package generics;

public class genrics_java {

	public static void main(String[] args) {
		/*
		 
		Container c=new Container();
		c.setX(10);
		System.out.println(c.getX());
		
		*/
		
		// without using generics we can use generic type by private Object x;
		
		/*  
		 
		 
		 
		Container<Integer> c=new Container<>();
		c.setX(10);
		System.out.println(c.getX());
		Container<Double> d=new Container<>();
		d.setX(2.7);
		System.out.println(d.getX());
		
	
		 */
		
		/*
		
		
		
		Container<Number> c=new Container<>();
		c.setX(10);
		System.out.println(c.getX());
		c.setX(2.7);
		System.out.println(c.getX());
		
		
		
		
		
		/*
		
		
		
		
		Container<Comparable> c=new Container<>();
		c.setX("hello");
		System.out.println(c.getX());
		
		
		
		
		
		*/
		
	}
}

/*
 
class Container
{
	private int data;
	public void setX(int data)
	{
		this.data=data;
	}
	public int getX()
	{
		return data;
	}
}


*/

/*



class Container<T extends Number>
{
	private T x;
	public void setX(T x)
	{
		this.x=x;
	}
	public T getX()
	{ 
		return x;
	}
}



*/

/*



class Container<T extends Comparable>
{
	private T x;
	public void setX(T x)
	{
		this.x=x;
	}
	public T getX()
	{ 
		return x;
	}
	
	public <E> void show(E data)
	{
		System.out.println(data);
	}
}




*/



class Container<T extends Comparable>
{
	private T x;
	public void setX(T x)
	{
		this.x=x;
	}
	public T getX()
	{ 
		return x;
	}
	
	
}
