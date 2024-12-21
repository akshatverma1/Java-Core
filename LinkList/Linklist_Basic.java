
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

    // Add in First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    // Add in Last

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

    // print the linklist
    public void PrintFunction() {
        if (Head == null) {
            System.out.println("Null Is Found");
            return;
        }
        Node currentNode = Head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.print("Null");
    }

    public static void main(String arr[]) {
        Linklist_Basic object1 = new Linklist_Basic();
        // object1.addFirst("Akshat");
        // object1.addLast("Verma");
        // object1.addLast("Lakshya");
        object1.PrintFunction();
    }
}