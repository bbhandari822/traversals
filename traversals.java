

/**
 * Created by Binod Bhandari on 8/18/17.
 */

class Node{

    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }

}
public class traversals {

    Node root;

    traversals(){
        root = null;
    }

    void inorder(Node node){

        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }


    void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node){

        if(node == null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key + " ");

    }

    void inorder(){
        inorder(root);
    }
    void preorder(){
        preorder(root);
    }

    void postorder(){
        postorder(root);
    }

    public static void main(String [] args){

        traversals tree = new traversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder: ");
        tree.inorder();

        System.out.println("\nInorder: ");
        tree.preorder();

        System.out.println("\nPostorder: ");
        tree.postorder();

    }
}
