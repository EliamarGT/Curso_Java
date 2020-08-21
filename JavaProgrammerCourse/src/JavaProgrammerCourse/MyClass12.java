package JavaProgrammerCourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class MyClass12 {

    public static void main(String[] args) {
       
        HashSet numbers = new HashSet();
        
        numbers.add(1);
        numbers.add(2.0);
        numbers.add("THREE");
        numbers.add(4);
        numbers.remove(2.0);
        numbers.add(2.5);
        numbers.size();
        //numbers.add(2, 2.5);
        //System.out.println(numbers.size());
        //numbers.clear();
        //System.out.println(numbers.contains("THREE"));
        //System.out.println(numbers.get(4));
        
        System.out.println(numbers);
    }
    
}
