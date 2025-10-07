package activities;
public class Activity3 {
    
    static final double EARTH_YEAR_IN_SECONDS = 31557600;
    static final double MERCURY = 0.2408467;
    static final double VENUS   = 0.61519726;
    static final double EARTH   = 1.0;
    static final double MARS    = 1.8808158;
    static final double JUPITER = 11.862615;
    static final double SATURN  = 29.447498;
    static final double URANUS  = 84.016846;
    static final double NEPTUNE = 164.79132;
    
    public static double calculateAge(double seconds, double orbitalPeriod) {
        return seconds / (EARTH_YEAR_IN_SECONDS * orbitalPeriod);
    }
    public static void main(String[] args) {
        double ageInSeconds = 1000000000;  
        System.out.println("Age in seconds: " + ageInSeconds);
        System.out.printf("On Earth: %.2f years%n", calculateAge(ageInSeconds, EARTH));
        System.out.printf("On Mercury: %.2f years%n", calculateAge(ageInSeconds, MERCURY));
        System.out.printf("On Venus: %.2f years%n", calculateAge(ageInSeconds, VENUS));
        System.out.printf("On Mars: %.2f years%n", calculateAge(ageInSeconds, MARS));
        System.out.printf("On Jupiter: %.2f years%n", calculateAge(ageInSeconds, JUPITER));
        System.out.printf("On Saturn: %.2f years%n", calculateAge(ageInSeconds, SATURN));
        System.out.printf("On Uranus: %.2f years%n", calculateAge(ageInSeconds, URANUS));
        System.out.printf("On Neptune: %.2f years%n", calculateAge(ageInSeconds, NEPTUNE));
    }
}