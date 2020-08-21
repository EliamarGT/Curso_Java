package JavaProgrammerCourse;

public class Loops {
    /*
    LOOPS ARE REPETITIONS
    WHILE , FOR, DO WHILE.
    
    ITERACION == CICLO
    
    WHILE(CONDITIONS){
    
        STATEMENTS;
        i++;
    }
    
    */
    public static void main(String[] args) {
     
        int i=1;
        
        //LOOP INFINITO PORQUE NO DEVUELVE FALSO.
        while(true){
            System.out.println(i);
            i++;
            
            if(i==1001){
                break;
            }
        }
        
    }
    
}
