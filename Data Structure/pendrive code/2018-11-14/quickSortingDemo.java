import java.util.Scanner;

class quickSortingDemo
{
	private static void quickSort(int[] arr, int p, int r)
	{
		if(p < r)
		{
			int q = partition(arr, p, r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
	}
	private static int partition(int[] arr, int p, int q)
	{
		int pivot = arr[q];
		int pindex = p;
		for(int i=p;i<q;i++)
		{
			if(arr[i] <= pivot)
			{
				// swapping arr[i] with arr[pindex];
				int temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
				
				pindex++;
			}
		}
		// swapping arr[pindex] with arr[q]
		int temp = arr[pindex];
		arr[pindex] = arr[q];
		arr[q] = temp;
		
		return pindex;
	}
	private static void display(int[] arr)
	{
		System.out.print("The array : ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		int p = 0;
		int r = arr.length-1;
		for(int i=0;i<9;i++)
		{
			arr[i] = 10-i;
		}
		display(arr);
		quickSort(arr, p, r);
		display(arr);
	}
}