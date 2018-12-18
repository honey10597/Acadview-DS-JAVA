class Node{
	Node right;
	Node left;
	int data;
	Node(int x){
		this.data=x;
	}
}
public class Demo{
	
	public Node insert(int[] arr,Node root,int i){
		if(i<arr.length){
			Node temp=new Node(arr[i]);
			root=temp;
			root.left=insert(arr,root.left,2*i+1);
			root.right=insert(arr,root.right,2*i+2);
		}
		return root;		
	}

	public void print(Node root){
		if(root==null)
			return ;
		System.out.print(root.data+" ");
		print(root.left);
		print(root.right);
	}
	public int leafNode(Node root){
		if(root.left==null && root.right==null){
			return 1;
		}
		else{
			return leafNode(root.left)+leafNode(root.right);
		}
	}
	public int nonLeafNode(Node root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 0;
		}
		else{
			return 1+nonLeafNode(root.left)+nonLeafNode(root.right);
		}
	}
	public int height(Node root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 0;
		}
		else{
			int l=height(root.left);
			int r=height(root.right);
			return (1+(l>r?l:r));
		}
	}
	public static void main(String[] args){
		Demo d=new Demo();
		Node root=null;
		int[] arr={23,42,61,70,21,50,90};
		root=d.insert(arr,root,0);
		d.print(root);
		System.out.println();
		System.out.println(d.leafNode(root));
		System.out.println(d.nonLeafNode(root));
		System.out.println(d.height(root));
	}
}

