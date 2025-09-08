package day6.collections.queues;

import java.util.*;
public class QueueCollection{
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(11);
        q.add(12);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}