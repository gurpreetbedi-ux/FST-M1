package activities;

class CustomException extends Exception {

 private String message;
 
 public CustomException(String message) {
     this.message = message;
 }
 
 @Override
 public String getMessage() {
     return message;
 }
}

public class Activity8 {
 public static void main(String[] args) {
     try {
         
         throw new CustomException("This is a custom exception message!");
     } catch (CustomException e) {
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}
