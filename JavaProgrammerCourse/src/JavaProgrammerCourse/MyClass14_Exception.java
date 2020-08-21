package JavaProgrammerCourse;

public class MyClass14_Exception {
    
    public static void main(String[] args) {
        
        int a=10, b=0 ,c;
        
        try{
            c =a/b; //-----> ACA SE VA GENERAR LA EXCEPCION...
        }catch(Exception e){
            System.out.println("NO ES POSIBLE DIVIDIR A ENTRE B.");
        }finally{
            System.out.println("NO HAY ERRORES.");
        }
        
        
    }
    
}
