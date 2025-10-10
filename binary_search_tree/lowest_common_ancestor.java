public class lowest_common_ancestor {
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static Node lowest_common_an(Node root , int n1,int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node left = lowest_common_an(root.left, n1, n2);
        Node right = lowest_common_an(root.right, n1, n2);
        if(left==null){
            return right;
        }
        if(right == null){
            return left;
        }

        return root;
    }
    public static void main(String arr[]){
        Node root = new Node(1);
        root.left=new Node (2);
        root.right = new Node(3);
        root.left.left = new Node (4);
        root.left.right = new Node (5);
        root.right.left = new Node(6);
        root.right.right = new Node (7);
        Node r = lowest_common_an(root, 4, 7);
        System.out.println(r.data);
    }
    
}