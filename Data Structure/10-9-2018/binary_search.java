import java.util.*; 
class binary_search {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. u want to search");
    int num=sc.nextInt();
    int a[]={10,15,25,34,45,65,74,85,95,99};
    int n=10;
    int beg=0,end=0,mid=0;
    int start=0,last=n-1;
    while(a[mid]!=num)
    {
      beg=start;
      end=last;
      mid=(beg+end)/2;
      if(num==a[mid])
        break;
      if(num>a[mid])
      {
        start=mid+1;

      }
      if(num<a[mid])
      {
        
        last=mid-1;
      }
    }
    System.out.println("element found at position "+mid);
  }
}