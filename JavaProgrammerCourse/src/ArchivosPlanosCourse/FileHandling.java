package ArchivosPlanosCourse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

   
    public static void main(String[] args) {
        
        File text = new File("C:\\Users\\ELIAMAR GOMEZ\\Documents\\NetBeansProjects\\Curso_Java\\JavaProgrammerCourse\\src\\ArchivosPlanosCourse\\Solucionarios_Curso.txt");
        Scanner scan;
        
        try{
            scan = new Scanner(text);
            while(scan.hasNext())
                System.out.println(scan.next());
            scan.close();
            
        }catch(FileNotFoundException e){
            System.out.println("EL ARCHIVO PRODUJO UN ERROR.");
        }
    }
    
}
