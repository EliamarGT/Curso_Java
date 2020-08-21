
package JavaProgrammerCourse;
import java.util.Scanner; //CLASS

public class UserInput {

    public static void main(String[] args) {
        /*
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE ALGUN NUMERO POR FAVOR: ");
        x= scan.nextInt();
        System.out.println("");
        System.out.println("EL NUMERO DIGITADO ES -->  "+x);
        */
        boolean x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("DIGITE ALGUN NUMERO POR FAVOR: ");
        x= scan.hasNextInt();
        
        if(x==true){
            System.out.println("HAS INGRESADO ALGUN NUMERO.");
        }else{
            System.out.println("NO HAS INGRESADO UN NUMERO.");
        }
    }
    
}
