import java.util.Scanner;

class InsertionSort
{
	static void sort(int arr[])
	{
		int n = arr.length;
		for(int i=1;i<n;i++)
		{
			int val = arr[i];
			int space = i;
			
			while(space > 0 && arr[space-1] > val)
			{
				arr[space] = arr[space-1];
				space--;
			}
			arr[space] = val;
		}
	}
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
class insertionSortingDemo
{
	public static void main(String[] args)
	{
		int arr[] = new int[10];
		for(int i=0;i<9;i++)
		{
			arr[i] = 10-i;
		}
		InsertionSort.display(arr);
		InsertionSort.sort(arr);
		InsertionSort.display(arr);
	}
}