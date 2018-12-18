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
class BST
{
	// Node insertNode(int arr[], Node root, int i)
	// {
		// if(i < arr.length)
		// {
			// Node temp = new Node(arr[i]);
			// if(root == null)
			// {
				// System.out.println("** inserted " + arr[i] + " at root.");
				// root = temp;
				// insertNode(arr, root, ++i);	
			// }
			// else if(arr[i] <= root.data)
			// {
				// System.out.println("** inserted " + arr[i] + " at left of " + root.data);
				// root.left = insertNode(arr, root.left, i);
			// }
			// else
			// {
				// System.out.println("** inserted " + arr[i] + " at right of " + root.data);
				// root.right = insertNode(arr, root.right, i);
			// }
		// }
		// return root;
	// }
	
	Node insertNode(Node root, int data)
	{
		if(root == null)
			root = new Node(data);
		else if(data <= root.data)
			root.left = insertNode(root.left, data);
		else
			root.right = insertNode(root.right, data);
		return root;
	}
	Node search(Node root, int data)
	{
		if(root.data == data)
			return root;
		else if(data <= root.data)
			return search(root.left, data);
		else
			return search(root.right, data);
	}
	void inorderDisplay(Node root)
	{
		if(root == null)
			return;
		
		inorderDisplay(root.left);
		System.out.print(root.data + " ");
		inorderDisplay(root.right);
	}
}
public class BinarySearchTree
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		BST t = new BST();
		Node root = null;
		//root = t.insertNode(arr, root, 0);
		for(int i=0;i<n;i++)
			root = t.insertNode(root, arr[i]);
		t.inorderDisplay(root);
	}
}