import java.util.Scanner;

class mergeSortingDemo
{
	private static void mergeSort(int[] arr, int p, int r)
	{
		if(p < r)
		{
			int q = (p+r)/2;
			mergeSort(arr,p,q);
			mergeSort(arr,q+1,r);
			merge(arr, p, q, r);
		}
	}
	private static void merge(int[] arr, int p, int q, int r)
	{
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i=0,j=0;
		
		for(i=0;i<n1;i++)
			left[i] = arr[p+i];
		for(j=0;j<n2;j++)
			right[j] = arr[q+1+j];
		
		i = j =0;
		int k = p;
		while(i < n1 && j < n2)
		{
			if(left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while(i < n1)
			arr[k++] = left[i++];
		while(j < n2)
			arr[k++] = right[j++];
	}
	private static void display(int[] arr)
	{
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
		mergeSort(arr, p, r);
		display(arr);
	}
}