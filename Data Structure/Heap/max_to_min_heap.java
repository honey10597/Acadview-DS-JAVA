public class max_to_min_heap {
  
  static void heap(int ar[],int i,int size)
  {
    int left=2*i+1;
    int right=2*i+2;
    int largest=i;
    if(size>left && ar[left]<ar[largest])
      largest=left;
    if(size>right && ar[right]<ar[largest])
      largest=right;
    if(largest!=i)
    {
      int t=ar[i];
      ar[i]=ar[largest];
      ar[largest]=t;
      heap(ar,largest,size);
    }
  }

  static void maxheap(int ar[],int n)
  {
    for(int i=(n/2)-1;i>=0;i--)
    {
      heap(ar,i,n);
    }
  }

  public static void main(String[] args) {
    int ar[]={20,15,10,5,6};
    int n=ar.length;
   
    System.out.print("Max heap : ");
    for(int i=0;i<ar.length;i++)
    {
      System.out.print(ar[i]+" ");
    }
    maxheap(ar,n);
    System.out.print("\nMin Heap : ");
    for(int i=0;i<ar.length;i++)
    {
      System.out.print(ar[i]+" ");
    }
  }
}