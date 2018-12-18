import java.util.*;
public class max_occurence_digits 
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count[]=new int[100];
    count[0]=0;
    int dup=a;
   
    while(dup>0){
      int i=dup%10;
    switch(i)
    {
      case 0: 
      count[0]+=1;
      break;
      case 1:count[1]+=1;
      break;
      case 2:count[2]+=1;
      break;
      case 3: count[3]+=1;
      break;
      case 4: count[4]+=1;
  
      break;
      case 5: {count[5]+=1;
      
      break;}
      case 6: count[6]+=1;
      
      break;
      case 7: count[7]+=1;
      
      break;
      case 8: count[8]+=1;
      
      break;
      case 9: count[9]+=1;
      
      break;
    }
    dup=dup/10;
    }
    int max=-999,index=0;
    for(int j=0;j<10;j++)
    {
      if(count[j]>max)
      {
        index=j;
        max=count[j];
      }
      if(count[j]!=0)
      {
        System.out.println(j+" occurs "+count[j]+" times");

      }
    }
    
     System.out.println(index+" occurs maximum  "+max+" times");
  }
}