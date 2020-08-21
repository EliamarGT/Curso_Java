package JavaProgrammerCourse;

public class NestedClasses {

    public static void main(String[] args) {
        
        College mycol1 = new College();
        College mycol2 = new College();
        College.Department CSE = mycol1.new Department();
        CSE.show();
        
    }
    
}
