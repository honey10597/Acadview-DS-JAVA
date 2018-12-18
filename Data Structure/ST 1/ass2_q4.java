import java.util.*;
public class ass2_q4 {
static int find(int x,int y)
{
	if(y==1)
		return x;
	else
		return find(x,y-1)*x;
}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter value of x & y");
	int x=sc.nextInt();
	int y=sc.nextInt();
	sc.close();
	int f=find(x,y);
	System.out.println(f);
	}

}
