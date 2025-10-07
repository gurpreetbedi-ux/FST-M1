package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
class Plane {

    private List<String> passengers;
    private int maxPassengers;
    private Date timeTookOff;
    private Date timeLanded;
  
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }
   
    public List<String> getPassengers() {
        return new ArrayList<>(passengers);
    }
    
    public boolean addPassenger(String name) {
        if (passengers.size() < maxPassengers) {
            passengers.add(name);
            return true;
        }
        return false; 
    }
   
    public boolean removePassenger(String name) {
        return passengers.remove(name);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
   
    public void takeOff() {
        this.timeTookOff = new Date();
        System.out.println("Plane took off at: " + timeTookOff);
    }
    public void land() {
        this.timeLanded = new Date();
        System.out.println("Plane landed at: " + timeLanded);
    }
  
    public Date getTimeTookOff() {
        return timeTookOff;
    }
    public Date getTimeLanded() {
        return timeLanded;
    }
}
public class Activity6 {
    public static void main(String[] args) {
        Plane plane = new Plane(3);
        plane.addPassenger("Alice");
        plane.addPassenger("Bob");
        plane.addPassenger("Charlie");
        System.out.println("Passengers onboard: " + plane.getPassengers());
        plane.takeOff();
        plane.land();
        System.out.println("Take off time: " + plane.getTimeTookOff());
        System.out.println("Landing time: " + plane.getTimeLanded());
    }
}









