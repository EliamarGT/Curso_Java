package JavaProgrammerCourse;
import java.util.Scanner;

public class Arrays_1 {
    
    public static void main(String[] args) {
        
        int[] arr;
        int n;
        arr = new int[1000];
        Scanner s= new Scanner(System.in);
        
        System.out.println("DIGITE EL TAMAÑO DEL ARREGLO: ");
        n = s.nextInt();
        System.out.println("");
        System.out.println("DIGITE EL NUMERO DE ELEMENTOS: ");
        
        for(int i=0; i<n ;i++){
            arr[i] = s.nextInt();
        }
        
        System.out.println("LOS NUMEROS DE ELEMENTOS SON: ");
        for(int i=0; i<n ;i++){
            System.out.print(arr[i] +" ");
            System.out.print("");
            
        }
        
    }
}
