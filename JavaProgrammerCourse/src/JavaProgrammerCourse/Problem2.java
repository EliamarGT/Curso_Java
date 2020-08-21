package JavaProgrammerCourse;

import java.util.Scanner;

public class Problem2 {

    /*
      FACTORIAL DE 5 = 5! ---> 5*4*3*2*1
    */
    public static void main(String[] args) {
        int i, fact=1 , n;
        Scanner s = new Scanner(System.in);
        
        System.out.println("DIGITE UN NUMERO :");
        n = s.nextInt(); 
        
        for(i=1; i<=n ;i++){
            fact = fact * i;
            
        }
        System.out.println(fact);
    }
    
}
