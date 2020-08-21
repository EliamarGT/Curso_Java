package JavaProgrammerCourse;

public class EnhancedFor {

    public static void main(String[] args) {
        String[] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        
        for(String day: days){
            System.out.println(day);
        }
        System.out.println("");
        System.out.print("NUMERO DE DIAS EN EL ARRAY : ");
        int x= days.length;
        System.out.println(x+".");
    }
    
}
