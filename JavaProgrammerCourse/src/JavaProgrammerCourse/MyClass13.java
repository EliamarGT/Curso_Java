package JavaProgrammerCourse;

import java.util.HashMap;

public class MyClass13 {

    
    public static void main(String[] args) {
       
        HashMap squares = new HashMap();
        squares.put(1, 1);
        squares.put(1, 4);
        squares.put(1, 9);
        squares.put(1, 16);
        
        //System.out.println(squares.containsKey(5));
        System.out.println(squares.replace(2, 4.5));
        System.out.println(squares);
        
        
    }
    
}
