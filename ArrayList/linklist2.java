public class linklist2 {

    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addone(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // public void addlast(String data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = newNode;
    // }
    // Node currNode = head;
    // for (int i = 0; currNode.next != null; i++) {
    // currNode = currNode.next;
    // }
    // }
    public static void main(String arr[]) {
        linklist2 list = new linklist2();
        list.addone("Akshat");
        list.addone("Verma");
        // System.out.println("Akshta Verma");
        // System.out.println("Akshta Verma");
    }
}
