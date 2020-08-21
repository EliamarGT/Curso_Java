package JavaProgrammerCourse;
import java.util.Scanner;
public class Problem1 {

    /*
    AGREGAR N NUMEROS NATURALES.
    
    N = 100 ---> 1+2+3+4...+100
    FOR LOOP  ---> i , sum 
    
    */
    public static void main(String[] args) {
       
        int i, sum=0 , n;
        Scanner s = new Scanner(System.in);
        
        System.out.println("DIGITE UN NUMERO :");
        n = s.nextInt(); //10
        
        for(i=1; i<=n ;i++){
            sum += i;
            
        }
        System.out.println(sum);
        
    }
    
}
