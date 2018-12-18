	import java.util.*;
public class tree_node
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ar[]={23,42, 61, 70, 21, 50, 90};
		tree t=new tree();
		node root=null;
		int i=0,temp=0;
// 		System.out.println("enter no.");
// 		for(i=0;i<ar.length;i++)
// 		{
// 			ar[i]=sc.nextInt();
// 		}
		root=t.insert(ar,root,0);
 		t.display_in(root);
 		System.out.println("\n\nleaf node :- "+t.leafnode(root));
 		System.out.println("\nnonleaf :- "+t.nonleaf(root));
 		System.out.println("\n height :- "+t.height(root));
	}
}
class node
{
	int data;
	node right,left;
	node(int data)
	{
		this.data=data;
	}
}

class tree
{
	public node insert(int ar[],node root,int i)
	{
		if(i<ar.length)
		{
			node temp=new node(ar[i]);
			root=temp;
			root.left=insert(ar,root.left,(2*i)+1);
			root.right=insert(ar,root.right,(2*i)+2);
		}
		return root;
	}
	public void display_in(node root)
	{
	    if(root==null)
	    return ;
	    display_in(root.left);
	    System.out.print(root.data+" ");
	    display_in(root.right);
	}
	
	public int leafnode(node root)
	{
	    if(root.left==null && root.right==null)
	    {
	        return 1;
	    }
	    else
	    return (leafnode(root.left) + leafnode(root.right));
	}
	public int nonleaf(node root)
	{
	    if(root==null)
	    return 0;
	    if(root.left==null && root.right==null)
	    return 0;
	    else
	    return (1+nonleaf(root.left)+nonleaf(root.right));
	}
	public int height(node root)
	{
	    if(root==null)
	    return 0;
	    if(root.left==null && root.right==null)
	    return 0;
	    else
	    {
	        int l=height(root.left);
	        int r=height(root.right);
	        return (1+(l>r?l:r));
	    }
	}
}