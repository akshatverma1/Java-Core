import java.util.*;

public class Linklist {

    public static Node Head = null;
    public static Node Tail = null;

    public static class Node {

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
        newNode.next = Head;
        Head = newNode;

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        Node currentNode = Head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void PrintFunction() {
        if (Head == null) {
            System.out.println("List is Not Found");
            return;
        }
        Node currentNode = Head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public int searchIterative(String key) {
        if (Head == null) {
            System.out.println("Linked List are Not Found");
            return -1;
        }
        int index = 0;
        Node currentNode = Head;
        while (currentNode != null) {
            if (currentNode.data == key) {
                System.out.println("Key is Found");
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public static void main(String arr[]) {
        Linklist ll = new Linklist();
        ll.addFirst("1");
        ll.addLast("2");
        ll.addLast("3");
        ll.addLast("4");
        ll.addLast("5");
        // ll.PrintFunction();
        System.out.println(ll.searchIterative("4"));
    }
}
