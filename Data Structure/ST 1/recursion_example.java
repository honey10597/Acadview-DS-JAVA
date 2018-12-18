
public class recursion_example {
static void find(int n)
{
	if(n>0)
	{
		System.out.print(n+" ");
		find(n-1);
		System.out.print(n+" ");
	}
	//System.out.println(n);
	//return 1;
	//System.out.println(2/10);
}
	public static void main(String[] args) {
		int n=3;
		find(n);
		//System.out.println(f);
	}

}
