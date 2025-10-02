public class diameter_of_the_tree{

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
    static class diameter{
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh)+1;
        }
        public static int diameter_func(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int dial  = diameter_func(root.left);
            int diar = diameter_func(root.right);

            return Math.max(lh+rh+1,Math.max(dial,diar));
        }
    }
    public static void main(String arr[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node (4);
        root.left.right=new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        diameter d = new diameter();
        System.out.println(d.diameter_func(root));
    }    
}