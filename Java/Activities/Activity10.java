package activities;
import java.util.HashSet;
public class Activity10 {
    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<String>();
       
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Mango");
        hs.add("Orange");
        hs.add("Grapes");
        
        System.out.println("Initial HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
      
        hs.remove("Banana");
        System.out.println("\nAfter removing Banana " + hs);
        
        boolean removed = hs.remove("Pineapple");
        if (!removed) {
            System.out.println("\nPineapple not found in the set");
        }
        
        String checkItem = "Mango";
        if (hs.contains(checkItem)) {
            System.out.println("\n" + checkItem + " is present in the set.");
        } else {
            System.out.println("\n" + checkItem + " is not present in the set.");
        }
      
        System.out.println("\nUpdated HashSet: " + hs);
    }
}