import java.util.*;
public class binary_search_tree {
    public static void main(String args[]) {
       tree t=new tree();
       int ar[]={551,1460,2596,29,0,-35,40,100,666,88,999};
       node root=null;
       for(int i=0;i<ar.length;i++)
       {
           root=t.insert(root,ar[i]);
       }
       
       System.out.println("");
	   System.out.println("search "+t.search(root,29));
	   System.out.println(t.delete(root,29));
       t.display(root);
    }
}
class node
{
    int data;
    node left,right;
    node(int data)
    {
        this.data=data;
        // right=left=null;
    }
}
class tree
{
    public node insert(node root,int d)
    {
        if(root==null)
        root=new node(d);
        else if(d<=root.data)
        {
            root.left=insert(root.left,d);
        }
        else
        {
            root.right=insert(root.right,d);
        }
        return root;
    }
    public void display(node root)
    {
        
        if(root==null)
        return ;
        System.out.print(root.data+" ");
        display(root.left);
        display(root.right);
    }
	public int search(node root,int d)
	{
		if(root.data==d)
			return root.data;
		else if(d<=root.data)
			return search(root.left,d);
		else if(d>root.data)
			return search(root.right,d);
		else
		{
			System.out.println("no. not available");
			return d;
		}
	}
	public node delete(node root,int d)
	{
		if(root==null)
			return root;
		else if(root.data>d)
			root.left=delete(root.left,d);
		else if(root.data<d)
			root.right=delete(root.right,d);
		else{
			if(root.left==null)
				return root.left;
			else if(root.right==null)
				return root.right;
			root.left=inorderSuccessor(root.right);
			root.right=delete(root.right,root.data);
		}
		return root;
	}
}
