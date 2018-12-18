class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
	
}

public class BinaryTree{
	void preorder(Node root){
		if(root==null){
			return ;
		}
		System.out.print(root.data+" ");		//pre
		
		preorder(root.left);
		
		//System.out.print(root.data+" ");		//in
		
		preorder(root.right);
		
		//System.out.print(root.data+" ");		//post
	}
	public static void main(String[] args){
		Node root=new Node(12);
		root.left=new Node(13);
		root.right=new Node(14);
		root.left.left=new Node(16);
		root.right.left=new Node(15);
		BinaryTree ob=new BinaryTree();
		ob.preorder(root);
	}
}