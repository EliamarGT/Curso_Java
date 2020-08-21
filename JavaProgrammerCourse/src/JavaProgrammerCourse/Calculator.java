package JavaProgrammerCourse;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
       
        int x,y;
        char ope;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE DOS NUMEROS POR FAVOR: ");
        x = scan.nextInt();
        y = scan.nextInt();
        
        System.out.println("");
        System.out.println("DIGITE UNA OPERACION + - * / ");
        ope = scan.next().charAt(0);
        
        switch(ope){
            
            case '+':
                
                System.out.println(x+y);
                break;
                
            case '-':
                
                System.out.println(x-y);
                break;
                
            case '/':
                
                System.out.println(x/y);
                break;
                
            case '*':
                
                System.out.println(x*y);
                break;
                
            default:
                System.out.println("CARACTER MAL SELECCIONADO.");
            
        }
        
        
    }
    
}
