package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    
    public void example(){

        String name[] = {"darryl", "elaine", "james", "chris", "kaladin", "Sophie", "max", "wayne", "marci"};

        System.out.println("Unsorted arr:" + Arrays.toString(name));
        
        Arrays.sort(name);

        System.out.println("Sorted arr:" + Arrays.toString(name)); 

        Arrays.sort(name , Collections.reverseOrder());

        System.out.println("sorted arr (reverse)" + Arrays.toString(name));

        
 }
}
