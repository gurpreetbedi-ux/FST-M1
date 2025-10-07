package activities;

interface BicycleParts {
    int tyres = 2;        
    int maxSpeed = 40;    
}

interface BicycleOperations {
    void applyBrake(int decrement);  
    void speedUp(int increment);      
}

class Bicycle implements BicycleParts, BicycleOperations {
    int currentSpeed;   
  
    public Bicycle(int startSpeed) {
        currentSpeed = startSpeed;
    }
  
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        if (currentSpeed < 0) {
            currentSpeed = 0; 
        }
        System.out.println("Applied brake. Current speed: " + currentSpeed);
    }
 
    public void speedUp(int increment) {
        currentSpeed += increment;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed; 
        }
        System.out.println("Sped up. Current speed: " + currentSpeed);
    }
    
    public void display() {
        System.out.println("Bicycle with " + tyres + " tyres and max speed " + maxSpeed);
        System.out.println("Current speed: " + currentSpeed);
    }
}

public class Activity7 {
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle(10);  
        myBike.display();
        myBike.speedUp(15);   
        myBike.applyBrake(5); 
        myBike.speedUp(30);   
    }
}