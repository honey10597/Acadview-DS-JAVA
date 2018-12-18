class Node
{
	int data;
	Node left, right;
	
	Node(int data)
	{
		this.data = data;
	}
}
class BinaryTreeExample
{
	private static void preorder(Node root)
	{
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String[] args)
	{
		Node root = new Node(12);
		root.left = new Node(13);
		root.right = new Node(14);
		root.left.right = new Node(16);
		root.right.right = new Node(15);
		
		preorder(root);
	}
}