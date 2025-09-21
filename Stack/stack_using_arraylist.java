import java.util.*;

public class stack_using_arraylist {

    static class stackOperation {
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data) {
            list.add(data);
        }

        public void pop() {
            if (list.size() == 0) {
                System.out.println("Stack is empty");
                return;
            }
            list.remove(list.size() - 1);
        }

        public int peek() {
            if (list.size() == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] aa) {
        System.out.println("Stack");
        stackOperation s = new stackOperation();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (s.list.size() > 0) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
    }
}