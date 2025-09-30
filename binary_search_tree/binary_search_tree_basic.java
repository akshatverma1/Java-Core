import java.util.LinkedList;
import java.util.Queue;

public class binary_search_tree_basic {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class tree{
        static int index=-1;
        public static Node binary_tree(int nodes[]){
        index++;
        if(nodes[index]==-1){
            return null;
        }

        Node newNode = new Node(nodes[index]);
        newNode.left = binary_tree(nodes);
        newNode.right = binary_tree(nodes);
        return newNode;
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void level_order(Node root){
        if(root == null){
            return;
        }
        Queue<Node> n = new LinkedList<>();
        n.add(root);
        n.add(null);
    
        while(!n.isEmpty()){
            Node currNode = n.remove();
            if(currNode == null){
                System.out.println();
                if(n.isEmpty()){
                    break;
                }else{
                    n.add(null);
                }
            }else{
                System.out.print(currNode.data+ " ");
                if(currNode.left != null){
                    n.add(currNode.left);
                }
                if(currNode.right != null){
                    n.add(currNode.right);
                }
            }
        }
    }
}
    public static void main(String arr[]){
        tree t = new tree();
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = t.binary_tree(nodes);
        System.out.println(root.data);
        t.preorder(root);
        System.out.println(" ");
        t.inorder(root);
        System.out.println(" ");
        t.postorder(root);
        System.out.println(" ");
        t.level_order(root);
    }
}