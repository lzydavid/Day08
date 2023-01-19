package sdf;

import java.io.Console;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.*;

public class HashTableExample {
    
    public void example01(){
        Map<String,Integer> phones = new Hashtable<>();

        phones.put("iPhone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 4);
        phones.put("Samsung",20);

        System.out.println("Total phone types: "+phones.size());

        for(String key:phones.keySet()){
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";

        while(!searchString.equals("quit")){
            Console con = System.console();
            
            searchString =  con.readLine("Enter searchString");
            
            if(phones.containsKey(searchString)){
                System.out.println(searchString + " - " + phones.get(searchString));
            }
            else{
                System.out.println("Items not found");
            }        
        }
        phones.clear();

        System.out.println("Total phone types: "+phones.size());
        
        
        
        
    }
}
