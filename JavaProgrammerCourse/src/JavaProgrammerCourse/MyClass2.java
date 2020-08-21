package JavaProgrammerCourse;

public class MyClass2 {

   
    public static void main(String[] args) {
        
        Accessories ipod = new Accessories("BLACK");
        
        //ipod.setColor("WHITE");
        //ipod.setColor("BLACK");
        ipod.setSize(10);
        
        System.out.println(ipod.getColor());
        System.out.println(ipod.getSize());
    }
    
}
