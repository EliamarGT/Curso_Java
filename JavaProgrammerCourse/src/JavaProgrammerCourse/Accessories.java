package JavaProgrammerCourse;


public class Accessories {
    
    String color;
    int size;
    
    Accessories(String c){
        setColor(c);
    }
    void setSize(int s){
        this.size = s;
    }
    
    void setColor(String c){
        this.color = c;
    }
    
    int getSize(){
        return size;
    }
    
    String getColor(){
        return color;
    }
}
