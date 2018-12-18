import java.util.*;
public class st1_10_marks {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter input\n");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    int e=sc.nextInt();
    find f=new find();
    int q=f.find_password(a,b,c,d,e);
    System.out.println(q);
  }
}
class find
{
  int returnlength(int n)
  {
    int c=0;
    while(n>0)
    {
      c++;
      n=n/10;
    }
    return c;
  }
  int find_password(int a,int b,int c,int d,int e)
  {
    int arr[]=new int[5];
    arr[0]=a;
    arr[1]=b;
    arr[2]=c;
    arr[3]=d;
    arr[4]=e;
    int i=0,j=0,k=0,num=0,s1=0,s2=0,pay=0;
    for(int p=0;p<arr.length;p++)
    {
      num=arr[p];
      int length=returnlength(num);
      //System.out.println("length is "+length);
      int digits[]=new int[length];
     // System.out.println("no. is "+)
      
        int temp=arr[p];
        j=0;
        while(temp>0)
        {
          int x=temp%10;
          digits[j]=x;
          temp=temp/10;
          j++;
        }
      
     // System.out.println("");
      
      
      int count[]=new int[100];
       count[0]=0;
      count[1]=0;
      count[2]=0;
      count[3]=0;
      count[4]=0;
      count[5]=0;
      count[6]=0;
      count[7]=0;
      count[8]=0;
      count[9]=0;
     
      int h=arr[p];
      //System.out.println("\na["+p+"] is "+h);
      while(h>0)
      {
        switch(h%10)
        {
          case 0:count[0]+=1;
          break;
          case 1:count[1]+=1;
         break;
          case 2:count[2]+=1;
         break;
          case 3: count[3]+=1;
         break;
          case 4: count[4]+=1;
          break;
          case 5: count[5]+=1;
          break;
          case 6: count[6]+=1;
          break;
          case 7: count[7]+=1;
         break;
          case 8: count[8]+=1;
          break;
          case 9: count[9]+=1;
          break;
        }
        h=h/10;
      }
      
     // System.out.println("\n");
      int newcount[]=new int[100];
      k=0;
      int freq[]=new int[length];
      for(i=0;i<10;i++)
      {
        if(count[i]!=0)
        {
          freq[k]=count[i];
         
          //System.out.println(i+" occurs "+freq[k]+" times");
           k++;
        }
      }
      //System.out.println("------------------------------");
    boolean flag=true;
     for(i=0;i<freq.length;i++)
     {//System.out.println("freq of " + digits[i] + " = " + freq[i]);
       for(j=i+1;j<freq.length;j++)
       {
         if(freq[i]!=0 && freq[j]!=0)
         {
           if(freq[i]!=freq[j])
         {
           flag=false;
         }
       }
       }
     }
     if(flag==true)
     {
       System.out.println("stable is : "+arr[p]);
       s1=s1+arr[p];
     }
     else
     {
       System.out.println("unstable is : "+arr[p]);
        s2=s2+arr[p];
     }
    }
    pay=s1-s2;
    return pay;
  }
}
