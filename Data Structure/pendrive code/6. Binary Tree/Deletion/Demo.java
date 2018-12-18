class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
	
}

public class Demo{
	void inOrder(Node root){
		if(root==null){
			return ;
		}
		
		inOrder(root.left);
		
		System.out.print(root.data+" ");		//in
		
		inOrder(root.right);
		
	}
	Node delete(Node root,int d){
		if(root==null){
			return root;
		}
		else if(root.data > d){
			root.left = delete(root.left,d);
		}
		else if(root.data < d){
			root.right = delete(root.right,d);
		}
		else{
			
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			root.data=inOrderSucsessor(root.right);
			root.right=delete(root.right,root.data);
		}
		return root;
	}
	int inOrderSucsessor(Node root){
		int minVal=root.data;
		while(root.left!=null){
			minVal=root.left.data;
			root=root.left;
		}
	return minVal;	
	}
	Node insert(Node root,int data){
		if(root==null){
			root=new Node(data);
		}
		else if(data<=root.data){
			root.left=insert(root.left,data);
		}
		else{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public static void main(String[] args){
		Demo d=new Demo();
		Node root=null;
		int[] arr={50,51,100,109,108,200};
		for(int i:arr)
			root=d.insert(root,i);
		d.inOrder(root);
		System.out.println();
		root=d.delete(root,51);
		d.inOrder(root);
		
	}
}