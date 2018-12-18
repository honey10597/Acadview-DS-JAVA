import java.util.Scanner;

class Node
{
	int data;
	Node left, right;
	
	Node(int data)
	{
		this.data = data;
	}
}
class BST
{
	private static Node insertNode(Node root, int data)
	{
		Node temp = new Node(data);
		if(root == null)
			root = temp;
		else if(data <= root.data)
			root.left = insertNode(root.left, data);
		else
			root.right = insertNode(root.right, data);
		return root;
	}
	private static Node delete(Node root, int data)
	{
		if(root == null)
			return root;
		else if(root.data > data)
			root.left = delete(root.left, data);
		else if(root.data < data)
			root.right = delete(root.right, data);
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = inorderSuccessor(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}
	private static int inorderSuccessor(Node root)
	{
		int minV = root.data;
		while(root.left != null)
		{
			minV = root.left.data;
			root = root.left;
		}
		return minV;
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
		System.out.print("Enter size : ");
		int n = sc.nextInt();
		System.out.println("Enter the elements :-");
		int arr[] = new int[n];
		Node root = null;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			root = insertNode(root, arr[i]);
		}
		
		inorder(root);
		System.out.print("\nEnter the num to delete : ");
		int d = sc.nextInt();
		root = delete(root, d);
		
		inorder(root);
		System.out.println();
	}
}