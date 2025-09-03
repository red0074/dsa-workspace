package day3.collections;
public class Llnked{
    Node head;
    class Node{
        //data
        String data;
        //next
        Node next;
        //constructor
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    //adding-first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    } 
    //adding-last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    //delete-first
    public void deleteFisrt(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    //delete last
    public void deleteLast(){
        //0 nodes
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        //1 node
        if(head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        while(curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
    }
    //print list
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]){
        Llnked list=new Llnked();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("list");
        list.printList();
        list.deleteFisrt();
        list.printList();
        list.deleteLast();
        list.printList();
    }
}