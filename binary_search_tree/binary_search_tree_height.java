public class binary_search_tree_height {
    static class Node{
        int data;
        Node left ;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class height{
        static int index = -1;
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
        public static int height_func(Node root){
            if(root == null){
                return 0;
            }
            int left  = height_func(root.left);
            int right = height_func(root.right);
            int h = Math.max(left, right)+1;
            return h ;
        }
        public static int count_node(Node root){
            if(root == null){
                return 0;
            }
            int left  = count_node(root.left);
            int right = count_node(root.right);
            int h = right+left+1;
            return h ;
        }
        public static int sum(Node root){
            if(root == null){
                return 0;
            }
            int left  = sum(root.left);
            int right = sum(root.right);
            int h = right+left+root.data;
            return h ;
        }
    }
    public static void main(String arr[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        height h = new height();
        Node root = h.binary_tree(nodes);
        System.out.println(h.height_func(root));
        System.out.println(h.count_node(root));
        System.out.println(h.sum(root));
    }
}   