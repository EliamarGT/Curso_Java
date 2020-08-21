package JavaProgrammerCourse;

import java.util.Scanner;

public class MissedOut1 {

    public static void main(String[] args) {
        
        //System.out.println("I AM SORRY");
        //20 ARRYS ---> INT, FLOAT,STRING
        //int[] numbers; 10 arrays
        Scanner scan = new Scanner(System.in);
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        int i,j;
        
        //COMO INSERTAR LOS 20 ARRAYS Y MOSTRARLOS.
        //ROW_SIZE , COLUMN_SIZE
        //NESTED FOR LOOP
        //3*3 = MATRIZ DE 9 ELEMENTOS.
        
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                numbers[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("");
        System.out.println("THE ELEMENTS ARE: ");
        
        for(i=0; i<3;i++){
            for(j=0;j<3;j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
    
}
