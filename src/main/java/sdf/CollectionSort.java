package sdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSort {
    
    public void example01(){
        
        List<Integer> numbers = new ArrayList<Integer>();

        for(int i=0;i<10;i++){
            numbers.add((int)(Math.random() * 100));
        }

        System.out.println("unsorted list: " + numbers);

        Collections.sort(numbers);


        System.out.println("Sorted list: " + numbers);

        Collections.sort(numbers,Collections.reverseOrder());

        System.out.println("Sorted list reverse: " + numbers);

        Integer[] nums = {10,5,8,19,50,48,70};

        Arrays.sort(nums);
        
        System.out.println("Sorted num:"+ Arrays.toString(nums));

        Arrays.sort(nums,Collections.reverseOrder());

    }

    public void example02(){

        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "Darryl@nus.edu.sg", 200000);
        Employee emp2 = new Employee("34567", "Dennis Ng", "SS", "Lecturer", "Dennis@nus.edu.sg", 200000);
        Employee emp3 = new Employee("23456", "Dendi Ng", "SS", "Lecturer", "Dendi@nus.edu.sg", 200000);
       

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Employees before sorting" + employees);

        Collections.sort(employees);

        System.out.println(employees);

        //Sorting using comparator and lamba
        employees.sort(Comparator.comparing(e -> e.getSalary()));

        System.out.println(employees);

    }
}
