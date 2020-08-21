package JavaProgrammerCourse;
import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        int i,j,n;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("DIGITE EL NUMERO DE LINEAS: ");
        n = s.nextInt(); 
        
        for(i=1 ; i<=n ;i++){
            
            for(j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
