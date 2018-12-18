import java.util.Scanner;

class SelectionSort
{
	static void sort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] < arr[min])
					min = j;
			}
			int t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
		}
	}
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
class selectionSortingDemo
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		for(int i=0;i<9;i++)
		{
			arr[i] = 10-i;
		}
		SelectionSort.display(arr);
		SelectionSort.sort(arr);
		SelectionSort.display(arr);
		
	}
}