import java.util.Scanner;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data = data;
	}
}
class LevelOrderInsertion
{
	private static Node insertLevelOrder(int[] arr, Node root, int i)
	{
		if(i >= arr.length)
			return root;
		else
		{
			Node temp = new Node(arr[i]);
			root = temp;
			
			root.left = insertLevelOrder(arr, root.left, 2*i+1);
			root.right = insertLevelOrder(arr, root.right, 2*i+2);
			return root;
		}
	}
	private static int countLeafNodes(Node root)
	{
		if(root.left == null && root.right == null)
			return 1;
		else
			return countLeafNodes(root.left) + countLeafNodes(root.right);
	}
	private static int countNonLeafNodes(Node root)
	{
		if(root == null || (root.left == null && root.right == null))
			return 0;
		else
			return (1 + countNonLeafNodes(root.left) + countNonLeafNodes(root.right));
	}
	private static int height(Node root)
	{
		if(root == null || (root.left == null && root.right == null))
			return 0;
		else
		{
			int l = height(root.left);
			int r = height(root.right);
			return (1 + (l > r ? l : r));
		}
	}
	private static void inorder(Node root)
	{
		if(root == null)
			return;
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		if(n > 0)
		{
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			Node root = null;
			root = insertLevelOrder(arr, root, 0);
			System.out.print("Inorder : ");
			inorder(root);
			System.out.println();
			System.out.println("No. of leaf nodes : " + countLeafNodes(root));
			System.out.println("No. of non-leaf nodes : " + countNonLeafNodes(root));
			System.out.println("Height : " + height(root));
		}
	}
}