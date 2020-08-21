package JavaProgrammerCourse;


public class Cat implements Pets{
    
    @Override
    public void sound() {
        System.out.println("MIAUU MIAUU.");
    }

    @Override
    public void eatFood() {
        System.out.println("FISH.");
    }

    @Override
    public void protect() {
        System.out.println("I AM PROTECTING YOU AND I AM YOUR CUTE KITTY");
    }
    
}
