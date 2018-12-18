class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
	}
	
}
public class Demo{
	Node temp;
	void inOrder(Node root){
		if(root==null){
			return ;
		}
		
		
		inOrder(root.left);
		
		System.out.print(root.data+" ");		//inOrder
		
		inOrder(root.right);
		
		
	}
	Node search(Node root,int data){
		if(root.data==data){
			return root;
		}
		else if(data<=root.data){
			return search(root.left,data);
		}
		else{
			return search(root.right,data);
		}
		
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
		int[] a={551,1460,2596,29,0,-35,40,100,666,88,999};
		Demo d=new Demo();
		Node root=null;
		for(int i:a)
			root=d.insert(root,i);
		
		d.inOrder(root);
		System.out.println();
		//======searching element===========
		try{
			System.out.println(" Element " + ( d.search(root,99) ).data + " Found");
		}
		catch(NullPointerException e){
			System.out.println(" Not found ");
		}
		//==================================
	}
}