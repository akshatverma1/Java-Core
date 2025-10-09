package Queues;

public class queue_using_linklist {
    static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static node head = null;
        static node tail = null;
        

        public boolean empty(){
            if(head == null && tail == null){
                return true;
            }
            return false;
        }


        public void add(int data){
            node newnode = new node(data);
            if(head == null){
                head = tail = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int remove(){
            if (empty()){
                return -1;
            }
            
            int data = head.data;
            if(tail == head){
                tail = head = null;
            } else {
                head = head.next;
            }
            return data;
        }
        public int peek(){
            if (empty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String arr[]){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        while(!q.empty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
