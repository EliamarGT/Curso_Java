package JavaProgrammerCourse;


public class Dog implements Pets{

    @Override
    public void sound() {
        System.out.println("GUAU GUAU.");
    }

    @Override
    public void eatFood() {
        System.out.println("BISCUITS.");
    }

    @Override
    public void protect() {
        System.out.println("I AM PROTECTING YOU.");
    }
    
}
