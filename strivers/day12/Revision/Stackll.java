package day12.Revision;
//insertion,deleteion,search-O(1)
public class Stackll {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        Node head;
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
        public void printStack(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(11);
        st.push(9);
        st.printStack();
        System.out.println("popped: "+st.pop());
        System.out.println("peek: "+st.peek());
        st.printStack();
    }
}
