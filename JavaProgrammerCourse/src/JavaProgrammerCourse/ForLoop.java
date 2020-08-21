
package JavaProgrammerCourse;


public class ForLoop {

   /*
    FOR LOOP -- CUANDO SE CONOCE EL NUMERO DE ITERACIONES.
    PROBLEM --- NUMEROS DEL 1 AL 50.
    */
    public static void main(String[] args) {
        int i=1 , n=50;
        
        for(;i<n;){
            
            if(i%2 ==0){
                System.out.println(i);
            }
            i++;
        }
        
    }
    
}
