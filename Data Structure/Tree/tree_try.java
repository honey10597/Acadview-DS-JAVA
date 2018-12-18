public class tree_try {
    public static void main(String args[]) 
    {
        tree t=new tree();
        node root=null;
        root=t.insert(root);
        System.out.println("Inorder :- ");
        t.display_in_order(root);
        System.out.println("\nPreorder :-");
        t.display_pre_order(root);
        System.out.println("\npostorder :-");
        t.display_post_order(root);
    }
}
class node
{
    int data;
    node left,right;
    node(int data)
    {
        this.data=data;
    }
}
class tree
{
    public node  insert(node root){
        root=new node(12);
        root.left=new node(13);
        root.right=new node(14);
        root.left.right=new node(16);
        root.right.right=new node(15);
        return root;
    }
    public void display_pre_order(node root)
    {
        if(root==null)
          return;
          System.out.print(root.data+" ");
          display_pre_order(root.left);
          display_pre_order(root.right);
    }
    public void display_in_order(node root)
    {
        if(root==null)
        return ;
        display_in_order(root.left);
        System.out.print(root.data+" ");
        display_in_order(root.right);
    }
    public void display_post_order(node root)
    {
        if(root==null)
        return ;
        display_post_order(root.left);
        display_post_order(root.right);
        System.out.print(root.data+" ");
    }
}

