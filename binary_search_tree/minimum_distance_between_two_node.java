
public class minimum_distance_between_two_node {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        } 
    }

    public static TreeNode lowest_Common_ancestor(TreeNode root,int n1,int n2){
        if(root == null|| root.data == n1 || root.data == n2){
            return root;
        }
        TreeNode left = lowest_Common_ancestor(root.left, n1, n2);
        TreeNode right = lowest_Common_ancestor(root.right, n1, n2);
        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }
        return root;
    }
    public static int minidect_helperfun(TreeNode root,int y){
        if(root == null){
            return -1;
        }
        if(root.data == y){
            return 0;
        }
        int left = minidect_helperfun(root.left, y);
        int right = minidect_helperfun(root.right, y);

        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right+1;
        }else{
            return left+1;
        }
    }
    public static int minidist(TreeNode root,int q,int p){
        TreeNode lsa = lowest_Common_ancestor(root, q, p);
        int d1 = minidect_helperfun(lsa,q);
        int d2 = minidect_helperfun(lsa,p);
        return d1+d2;
    }

    public static void main(String arr[]){
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode (2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode (4);
        root.left.right = new TreeNode (5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode (7);
        System.out.println(minidist(root, 4, 7));
    }
}
