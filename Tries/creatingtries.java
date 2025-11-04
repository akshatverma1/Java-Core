public class creatingtries {
    static class Node{
        Node[] children = new Node[26];
        boolean aow = false;
        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void inserting(String word){
        Node curr = root;
        for (int level = 0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.aow = true;
    }

    public static boolean searching(String key){
        Node curr = root;
        for(int i=0;i<key.length();i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.aow == true;
    }
    public static void main(String arr[]){
        String words[] = {"the","a","there","their","any","thee"};
        for(int i = 0;i<words.length;i++){
            inserting(words[i]);
        }

        System.out.println(searching("the"));
    }
}