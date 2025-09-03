package stacks;

public class StackLL {
    //node creation
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    //stack methods
    static class Stack{
        public Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(10);
        s.push(11);
        s.push(12);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
