package JavaProgrammerCourse;


public class DoWhile {

    /*
     DO --- PRIMERO LO EJECUTA, LUEGO WHILE LO REVISA.
    
    */
    public static void main(String[] args) {
       int i=1;
       
       do{
           System.out.println(i);
           i++;
       }while(i>2);
       
       i=1;
       while(i>2){
           System.out.println(i);
           i++;
       }
        
        
    }
    
}
