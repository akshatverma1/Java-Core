package Queues;

public class queue_using_array {
    static class Queue{
        static int arr[];
        static int size ;
        static int rear;
        
        Queue(int n){
            arr = new int[n];
            size = n;
            rear =-1;
        }
        public boolean empty(){
            return rear==-1;
        }
        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is the Full");
            }
            rear = rear+1;
            arr[rear] = data;
        }
        public int remove(){
            if(empty()){
                System.out.println("Queue is the Empty");
                return -1;
            }
            int front = arr[0];
            rear = rear+1;
            return front;
        }
        public int peek(){
            if(empty()){
                System.out.println("Queue is the Empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String arr[]){
        int n= 9;
        Queue q = new Queue(n);
        // q.add(1);
        // System.out.println(q.peek());
    }
}
