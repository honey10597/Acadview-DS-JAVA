import java.util.*;
public class ass2_q6_rem_duplicate {
	
	public static String removeDuplicate(String str) {
		
		//base case
		if(str.length() == 1) {
			return str;
		}
			
		//Hypothesis
		String smallans = removeDuplicate(str.substring(1));
		
		//Step
		if(str.charAt(0) == smallans.charAt(0)) {
			return smallans;
		}else {
			return (str.charAt(0) + smallans);
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		String re="";
		int i=0;

		
		re = removeDuplicate(s);
		System.out.print(re);
	}

}
