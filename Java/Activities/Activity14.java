package activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Activity14 {
    public static void main(String[] args) {
        try {
           
            File file = new File("abc.txt");
            
            boolean fstatus = file.createNewFile();
            if (fstatus) {
                System.out.println("File created " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
          
            FileWriter writer = new FileWriter(file);
            writer.write("Hello! This is text written to the file.\n");
            writer.write("This is Activity 14 of File I/O operations.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating or writing the file.");
            e.printStackTrace();
        }
    }
}