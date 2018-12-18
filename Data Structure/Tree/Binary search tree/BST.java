import java.util.*;
public class BST {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int ar[]={551,1460,2596,29,0,-25,40,100,666,88,999};
        node root=null;
        tree t=new tree();
        for(int i=0;i<ar.length;i++)
        {
            root=t.insert(root,ar[i]);
        }
        t.display(root);
        System.out.println("\n");
        root=t.delete(root,100);
        t.display(root);
        
        System.out.println("\n");
        
        
        System.out.println("height : "+t.height(root));
        
        System.out.println("leaf : "+t.leaf(root));
        
         System.out.println("Non-leaf : "+t.nonleaf(root));
         
          System.out.println("no. of nodes : "+t.no_ofnodes(root));
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
    public int no_ofnodes(node root)
    {
        if(root==null)
          return 0;
        else
        return (1+no_ofnodes(root.left)+no_ofnodes(root.right));
    }
    
    public int nonleaf(node root)
    {
        if(root==null)
          return 0;
        else if(root.left==null && root.right==null)
          return 0;
        else
          return(1+nonleaf(root.left)+nonleaf(root.right));
    }
    
    public int leaf(node root)
    {
        if(root==null)
          return 0;
        else if(root.left==null && root.right==null)
          return 1;
        else 
        return (leaf(root.left)+leaf(root.right));
    }
    
    public int height(node root)
    {
        if(root==null)
          return 1;
        else if(root.left== null && root.right==null)
          return 0;
        else
        {
            int l=height(root.left);
            int r=height(root.right);
            return (1+((l>r)?l:r));
        }
    }
    
    public node insert(node root,int d)
    {
        if(root==null)
          root=new node(d);
        else if(d>root.data)
          root.right=insert(root.right,d);
        else
          root.left=insert(root.left,d);
          
        return root;
    }
    
    public node delete(node root,int d)
    {
        if(root==null)
         return root;
        else if(d>root.data)
         root.right=delete(root.right,d);
        else if(d<root.data)
         root.left=delete(root.left,d);
        else{
            
            if(root.left==null)
               {
                   root.data=root.right.data;
                   root.right=null;
               }
            else if(root.right==null)
               {
                   root.data=root.left.data;
                   root.left=null;
               }
            else
            {
                root.data=root.right.data;
                root.right=null;
            }
        }
        return root;
    }
    
    public void display(node root)
    {
        if(root==null)
          return ;
        display(root.left);
        System.out.print(root.data+" ");
        display(root.right);
    }
}
