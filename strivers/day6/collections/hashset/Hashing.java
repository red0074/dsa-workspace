package day6.collections.hashset;

import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        //creation
        Set<Integer> set=new HashSet<>();
        //insert
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(5);
        //search
        if(!set.contains(10)){
            System.out.println("does not contain in the set");
        }
        //delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain or you had deleted it");
        }
        //size
        System.out.println("size: "+set.size());
        //=>printing set
        //(1)using print statement
        System.out.println(set);
        //(2)using Iterator
        Iterator it=set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
