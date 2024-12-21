
import java.util.*;

public class Linklist_Basic {
    Node Head = null;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }

    }

    public static void main(String arr[]) {
        Linklist_Basic object1 = new Linklist_Basic();
    }
}