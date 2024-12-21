
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

    // Delete First
    public void DeleteFirst() {
        if (Head == null) {
            System.out.println("No Node is Present For Delete");
            return;
        }
        Head = Head.next;
    }

    public void DeleteLast() {
        if (Head == null) {
            System.out.println("No Node is Present For Delete");
            return;
        }
        if (Head.next == null) {
            Head = null;
            return;
        }

        Node currentNode = Head;
        Node SecondLast = Head.next;
        while (SecondLast.next != null) {
            SecondLast = SecondLast.next;
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }

    public static void main(String arr[]) {
        Linklist_Basic object1 = new Linklist_Basic();
        object1.addFirst("Akshat");
        object1.addLast("Verma");
        object1.addLast("Lakshya");
        // object1.PrintFunction();
        // object1.DeleteFirst();
        object1.DeleteLast();
        object1.PrintFunction();
    }
}