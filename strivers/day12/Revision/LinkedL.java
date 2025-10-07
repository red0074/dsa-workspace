package day12.Revision;
//inserstion-O(1)
//deletion-O(n)
//search-O(n)

public class LinkedL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
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

    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
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
    public void printLL(){
        Node curr=head;
        while (curr!=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedL ll=new LinkedL();
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addLast(11);
        ll.printLL();
        ll.addFirst(34);
        ll.addFirst(344);
    }

}