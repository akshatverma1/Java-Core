public class kth_level {
    static class Node{
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void kth_level_function(Node root,int k ,int level){
        if(root == null){
            return;
        }
        if(k==level){
            System.out.print(root.val+" ");
            return;
        }

        kth_level_function(root.left, k, level+1);
        kth_level_function(root.right, k, level+1);
    }
    public static void main(String arr[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node (4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kth_level_function(root, 2, 0);
    }
    
}