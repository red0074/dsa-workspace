package day6.collections.hashmap;

import java.util.*;

public class MapHashing {
    public static void main(String[] args) {
        //creation
        HashMap<String,Integer> map=new HashMap<>();
        //insertion
        map.put("india",120);
        map.put("us", 30);
        map.put("china",150);
        //printing
        System.out.println(map);
        //update
        map.put("china",160);
        System.out.println(map);
        //=>search
        //1.whether the key contains or not
        if(!map.containsKey("Russia")){
            System.out.println("Does not contain in the map");
        }
        //2.get the value for specific key
        System.out.println(map.get("india"));//key exists so prints value
        System.out.println(map.get("Russia"));//key not exists so returns null
        //->Iteration
        //1.foreach
        for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //2.using keySet
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }
        //remove
        map.remove("china");
        System.out.println(map);
    }
    
}
