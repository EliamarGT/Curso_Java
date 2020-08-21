package JavaProgrammerCourse;


public class Cat1 extends Animal{
    
    String color = "BLACK";
    
    @Override
    void sound(){
        System.out.println("MIAU MIAU.");
    }
    
    void showColor(){
        System.out.println(super.color);
    }
}
