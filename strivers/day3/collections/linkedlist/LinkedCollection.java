package linkedlist;

import java.util.LinkedList;

public class LinkedCollection {
    public static void main(String args[]){
        //creation
        LinkedList<String> list=new LinkedList<>();
        //adding first
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        //adding last
        list.addLast("linked");
        // or
        list.add("list");
        System.out.println(list);
        list.addFirst("This");
        System.out.println(list);
        //getting the list size
        System.out.println(list.size());
        //traversing list
        for(int i=0;i<list.size();i++){
            //getting node data using index
            System.out.println(list.get(i));
        }
    }
}
