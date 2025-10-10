package activities;

interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        
        Addable ad1 = (num1, num2) -> num1 + num2;
    
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };
        
        int sum1 = ad1.add(10, 20);
        int sum2 = ad2.add(30, 40);
        // Display results
        System.out.println("Sum using ad1 (no body): " + sum1);
        System.out.println("Sum using ad2 (with body): " + sum2);
    }
}