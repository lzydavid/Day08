package sdf;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    
    public void example(){
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<10;i++){
            stack.push(i);
        }

        for(int i=0;i<5;i++){
            Integer stackItems = stack.pop();
            System.out.println("Popped item: " + stackItems);
        }

        Integer item = stack.peek();
        System.out.println("item on top of stack: " + item);
        Integer item2 = stack.lastElement();
        System.out.println("item on top of stack: " + item2);

        Integer firstItem = stack.firstElement();
        System.out.println("First element: " + firstItem);

        Integer indexE = stack.search(2);
        System.out.println("Stack element found at: " + indexE);

        //iterting through a stack
        Iterator<Integer> its = stack.iterator();
        while(its.hasNext()){
            Integer stackIT = its.next();
            System.out.println("Iterator stack item: " + stackIT);
        }
    }
}
