package activities;

import java.util.ArrayList;
public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
       
        myList.add("Aman");
        myList.add("Riya");
        myList.add("Karan");
        myList.add("Simran");
        myList.add("Neha");

        System.out.println("All names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
      
        System.out.println("\nThe 3rd name in the list: " + myList.get(2));
        
        String checkName = "Karan";
        if (myList.contains(checkName)) {
            System.out.println(checkName + " exists in the list.");
        } else {
            System.out.println(checkName + " does not exist in the list.");
        }
  
        System.out.println("\nNumber of names in the list: " + myList.size());
       
        myList.remove("Riya");
        System.out.println("\nAfter removing 'Riya':");
        System.out.println("Updated list: " + myList);
        System.out.println("New size of the list: " + myList.size());
        
    }
}