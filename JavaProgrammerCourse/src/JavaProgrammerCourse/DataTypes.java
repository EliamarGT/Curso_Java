package JavaProgrammerCourse;

public class DataTypes {

    /* DATOS PRIMITIVOS Y NO PRIMITIVOS.
    
    DATOS PRIMITIVOS: INT, DOUBLE, FLOAT, CHAR, BOOLEAN, ETC -- DEFINE EL TIPO DE DATOS.
    DATOS NO PRIMITIVOS: STRING, ARRAYS -- SE REFIERE A CADENAS DE CARACTERES DE UN MISMO TIPO.
    */
    public static void main(String[] args) {
        
        int    var1= 5;
        var1= (int) 3.95; //EXPLICIT TYPE CONVERSION.
        //System.out.println(var1);
        
        float  var2= 3.14f; 
        var2=5; //IMPLICIT TYPE CONVERSION.
        System.out.println(var2);
        
        double var3= 5.678;
        char   var4= '*';
        boolean var5= true;
        String var6= "Mask";
        
        //System.out.println(var6);
        
    }
    
}
