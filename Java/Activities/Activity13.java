package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Activity13 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();
        
        System.out.print("How many numbers do you want to enter? ");
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scan.nextInt();
            list.add(num);
        }
     
        int randomIndex = indexGen.nextInt(list.size());
      
        System.out.println("\nRandomly selected index: " + randomIndex);
        System.out.println("Value at that index: " + list.get(randomIndex));
        scan.close();
    }
}