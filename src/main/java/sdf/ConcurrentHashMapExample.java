package sdf;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    
    public void example(){
        Map<String,Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer", 5);
        laptops.put("Apple", 10);
        laptops.put("Dell", 40);
        laptops.put("MSI",8);
        laptops.put("Asus", 15);

        System.out.println("Total laptops: " + laptops.size());

        for(String key:laptops.keySet()){
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)){
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String,Integer>)laptops).elements();
        while(elems.hasMoreElements()){
            System.out.println(elems.nextElement());
        }

        Integer i = laptops.putIfAbsent("Apple", 50);
        if(i!=null){
            System.out.println("Item found: " + i);
        }

        laptops.putIfAbsent("Microsoft", 10);
        for(String key:laptops.keySet()){
            System.out.println(key + " - " + laptops.get(key));
        }

    }
}
