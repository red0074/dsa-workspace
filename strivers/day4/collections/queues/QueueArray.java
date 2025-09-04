package day4.collections.queues;

public class QueueArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int size){
            arr=new int [size];
            this.size=size;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //enqueue-o(1)
        public static void add(int data){
            if(rear==size-1){
                System.out.println("ful queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        //dequeue-o(n)
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        //peek -o(n)
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(10);
        q.add(11);
        q.add(12);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
