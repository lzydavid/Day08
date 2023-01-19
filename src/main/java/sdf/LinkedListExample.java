package sdf;

import java.util.LinkedList;

public class LinkedListExample {
    
    public void example01(){
        LinkedList<String> li = new LinkedList<String>();

        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        li.add("E");
        li.add("F");
        li.add("G");

        li.forEach(item -> {System.out.println(item);});

        li.remove("C");

        System.out.println(li);

        li.removeFirst();

        li.removeLast();

        System.out.println(li);
    }


}
