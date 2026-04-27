class Node{
    int data;
    Node left;
    Node Right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BST{
    Node root;

    //INSERT
    Node insert(Node root, int key){
        if(root==null){
            return new Node(key);
        }

        if(key <root.data){
            root.left = insert(root.left,key);
        }
        else if(key > root.data){
            root.right=insert(root.right,key);
        }
        return root;
    }
}