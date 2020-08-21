package JavaProgrammerCourse;

public class Module2_1 {

    /*
    I AM GONNA CHECK WHETHER STUDENT PASSEED OR NOT
    SI EL ALUMNO SOBREPASA LA NOTA DE 88, SE VA IMPRIMIR EXCELENTE.
    PASS MARSK => 40
    
    */
    public static void main(String[] args) {
       
        int nota = 45;
        if(nota>48){
            System.out.println("PASS");
            
            if(nota>=88){
                System.out.println("EXCELENTE");
            }
        }else{
            System.out.println("FAIL");
        }
        
    }
}
