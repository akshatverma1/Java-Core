package Stack;

public class stack_using_linklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class stack {
        private Node head = null;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            System.out.println(data + " pushed to stack");
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(head.data + " popped from stack");
            head = head.next;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack using Linklist");
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        s.pop(); // Will print "Stack is empty"
    }
}