package activities;

import java.util.HashMap;
import java.util.Map;
public class Activity11 {
    public static void main(String[] args) {
        
        Map<Integer, String> colours = new HashMap<>();
  
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");
       
        System.out.println("Original Map: " + colours);
      
        colours.remove(2);
        System.out.println("\nAfter removing 2: " + colours);
        
        if (colours.containsValue("Green")) {
            System.out.println("\nColour 'Green' exists");
        } else {
            System.out.println("\nColour 'Green' does not exist");
        }
      
        System.out.println("\nSize of the Map: " + colours.size());
    }
}
