class Node{
	int data;
	Node right;
	Node left;
	Node(int data){
		this.data=data;
	}
}

public class Demo{
	Node insert(int[] arr,Node root,int i){
		if(i>=arr.length){
			return null;
		}
		else{
			Node tmp=new Node(arr[i]);
			root=tmp;
			root.left=insert(arr,root.left,2*i+1);
			root.right=insert(arr,root.right,2*i+2);
		}
		return root;
	}

	int leafNode(Node root){
		if(root==null){
			return 0;
		}
		if(root.right==null && root.left==null){
			//System.out.println("\nleafnode: "+root.data); 	//if U want to see leafnode
			return 1;
		}
		else{
			return leafNode(root.left)+leafNode(root.right);
		}
	}

	void print(Node root){
		if(root==null){
			return ;
		}
		else{
			System.out.print(root.data+" ");
			print(root.left);
			print(root.right);
		}
	}
	public static void main(String[] args){
		Demo ob= new Demo();
		int[] arr={1,2,3,4,5,6,7};
		Node root=null;
		root=ob.insert(arr,root,0);
		ob.print(root);
		System.out.println("\nleafnode count : "+ob.leafNode(root));
	}
}