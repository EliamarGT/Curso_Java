package JavaProgrammerCourse;

public class Logic {

    /* a = 105;
    
    a>100 && a<200 --- AND ---- AMBAS DEBERIAN SER VERDADERAS
    
    cond1 || cond2 --- CUALQUIERA PUEDE SER VERADERA
    
    !cond1 --- NOT (negacion) --- cond1=true devuelve verdadero ---
                        SI LA CONDICION ES FALSA DEVUELVE VERDADERO.
     
    */
    public static void main(String[] args) {
      
        //------------------------- PARTE UNO ----------------------
        int age = 16;
        
        if(age>=13 && age<=19){
            System.out.println("I AM A TEENAGER.");
        }
        else{
            System.out.println("I AM NOT A TEENAGER.");
        }
        
        
    }
    
}
