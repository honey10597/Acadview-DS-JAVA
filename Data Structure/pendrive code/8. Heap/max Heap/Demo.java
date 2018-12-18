public class Demo{
	public void buildMax(int[] a){
		int heapsize=a.length;
		for(int i=(heapsize-2)/2;i>=0;i--){
			maxHeapify(a,i);
		}
	}
	public void maxHeapify(int[] a,int i){
		int l=(2*i)+1;
		int r=(2*i)+2;
		int largest=i;
		int heapsize=a.length;
		if(l<heapsize && a[l]>a[largest]){
			largest=l;
		}
		if(r<heapsize && a[r]>a[largest]){
			largest=r;
		}
		if(i!=largest){
			//swap(a[i],a[largest]);
			int t=a[i];			//=====swapping====
			a[i]=a[largest];
			a[largest]=t;
			maxHeapify(a,largest);
		}
	}
	
	public static void main(String[] args){
		int[] a={6,13,4,5,4,10,2,1,7};
		Demo obj=new Demo();
		obj.buildMax(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}