package Tree;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class bst{

    static Node insert(Node root,int val){
        if(root==null) return new Node(val);

        if(val<root.data)
            root.left=insert(root.left,val);
        else
            root.right=insert(root.right,val);

        return root;
    }

    static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args){

        Node root=null;

        root=insert(root,10);
        insert(root,5);
        insert(root,15);
        insert(root,2);
        insert(root,7);
        insert(root,20);

        inorder(root);
    }
}