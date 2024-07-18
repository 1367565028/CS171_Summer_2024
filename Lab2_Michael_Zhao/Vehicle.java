
public class Vehicle {

    // Public fields - accessible from anywhere
    public String brand;
    public String model;

    // Protected fields - accessible within the package and subclasses
    protected int year;
    protected String color;

    // Private fields - accessible only within this class
    private final int hiddenNumber = 13;

    // Public constructor - accessible from anywhere
    public Vehicle(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year + getHiddenNumber();
        this.color = color;
    }

    // Public no-argument constructor - accessible from anywhere
    public Vehicle() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
        this.color = "Unknown";
    }

    // Public methods - accessible from anywhere
    public void move() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is moving");
    }

    public void stop() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is stopped");
    }

    public void accelerate() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is accelerating");
    }

    public void decelerate() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is decelerating");
    }

    public void turnLeft() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is turning left");
    }

    public void turnRight() {
        System.out.println("Vehicle " + this.brand + " " + this.model + " is turning right");
    }

    public void display() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Hidden Number: " + getHiddenNumber());
    }

    // Protected methods - accessible within the package and subclasses
    protected int getHiddenNumber() {
        return hiddenNumber;
    }
}
