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

    public int searchRecursiveone(String Key) {
        return searchRecursive(Head, Key, 0);
    }

    public int searchRecursive(Node currentNode, String key, int index) {
        if (currentNode.next == null) {
            System.out.println("Linklist is not Found");
            return -1;
        }

        if (currentNode.data == key) {
            System.out.println("Key is Found");
            return index;
        }
        return searchRecursive(currentNode.next, key, index + 1);
    }

    // Function to reverse the linked list
    public void reversee() {
        Node prev = null;
        Node current = Head;
        Node next = null;

        while (current != null) {
            next = current.next; // store next
            current.next = prev; // reverse the link
            prev = current; // move prev forward
            current = next; // move current forward
        }

        Head = prev; // update head to new first node
    }

    public void findanddelete(int n) {
        if (Head == null) {
            System.out.println("Linklist is not Found");
            return;
        }

        int size = 0;
        Node currentNode = Head;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        System.out.println("Sixe :" + size);

        if (size == n) {
            Head = Head.next;
            return;
        }

        int i = 1;
        int index = (size - n);
        Node pre = Head;
        while (i < index) {
            pre = pre.next;
            i++;
        }
        pre.next = pre.next.next;
        return;
    }

    // helper functiom
    private Node helper(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean plaindrome() {
        if (Head == null || Head.next == null) {
            System.out.println("LINKLIST IS NOT FOUND");
            return false;
        }
        Node mid = helper(Head);
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = Head;

        while (right != null) {
            if (left.data != right.data) {
                System.out.println("Its not Palindrome");
                return false;
            }
            left = left.next;
            right = right.next;

        }
        System.out.println("Its a Palindrome");
        return true;
    }

    public static void main(String arr[]) {
        Linklist ll = new Linklist();
        ll.addFirst("1");
        ll.addLast("2");
        ll.addLast("3");
        ll.addLast("2");
        ll.addLast("1");
        ll.PrintFunction();
        // System.out.println(ll.searchIterative("4"));
        // System.out.println(ll.searchRecursiveone("4"));
        // System.out.println("Reversed List:");
        // ll.reversee();
        // ll.findanddelete(1);
        // System.out.println("After Deleted the Node");
        // ll.PrintFunction();
        System.out.println(ll.plaindrome());
    }
}
