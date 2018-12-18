import java.util.Scanner;

class HeapDemo
{
	private static void swap_indexes(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	private static void build_max_heap(int[] arr)
	{
		int heapsize = arr.length;
		for(int i = (heapsize-2)/2;i >= 0;i--)
			max_heapify(arr, i);
	}
	
	private static void max_heapify(int[] arr, int i)
	{
		int heapsize = arr.length;
		
		int l = 2*i+1;
		int r = 2*i+2;
		int largest = i;
		
		if(l < heapsize && arr[l] > arr[largest])
			largest = l;
		if(r < heapsize && arr[r] > arr[largest])
			largest = r;
		if(i != largest)
		{
			swap_indexes(arr, i, largest);
			max_heapify(arr, largest);
		}
	}
	
	private static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Start entering the elements :-");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		display(arr);
		
		build_max_heap(arr);
		
		display(arr);
		System.out.println();
	}
}