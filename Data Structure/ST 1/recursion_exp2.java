
public class recursion_exp2 {
static void fool(int n,int sum) {
	int k=0,j=0;
	if(n==0) return;
	k=n%10;
	j=n/10;
	sum=sum+k;
	fool(j,sum);
	System.out.println(k);
			
	
}
	public static void main(String[] args) {
		int a=2048,sum=0;
		fool(a,sum);
		System.out.println(sum);

	}

}
