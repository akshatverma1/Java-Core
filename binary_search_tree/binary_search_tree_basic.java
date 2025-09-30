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
}
    public static void main(String arr[]){
        tree t = new tree();
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = t.binary_tree(nodes);
        System.out.println(root.data);
    }
}