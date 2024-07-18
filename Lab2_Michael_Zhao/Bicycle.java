
public class Bicycle extends Vehicle {
    
    private int leastGear;
    private int largestGear;
    private int currentGear;
    private boolean hasBell;
    private boolean isLubricated;
    private int currentSpeed;

    public Bicycle(String brand, String model, int year, String color) {
        super(brand, model, year, color);
        this.leastGear = 1;
        this.largestGear = 5;
        this.currentGear = 1;
        this.hasBell = false;
        this.isLubricated = false;
        updateSpeed();
    }
    
    public Bicycle(String brand, String model, int year, String color, int leastGear, int largestGear) {
        super(brand, model, year, color);
        this.leastGear = leastGear;
        this.largestGear = largestGear;
        this.currentGear = leastGear;
        this.hasBell = false;
        this.isLubricated = false;
        updateSpeed();
    }
    
    public Bicycle(String brand, String model, int year, String color, int leastGear, int largestGear, boolean hasBell) {
        super(brand, model, year, color);
        this.leastGear = leastGear;
        this.largestGear = largestGear;
        this.currentGear = leastGear;
        this.hasBell = hasBell;
        this.isLubricated = false;
        updateSpeed();
        if (hasBell) {
            ringBell();
        }
    }

    private void updateSpeed() {
        if (isLubricated) {
            currentSpeed = 6 * currentGear;
        } else {
            currentSpeed = (6 * currentGear) / 2;
        }
    }
    
    @Override
    public void move() {
        System.out.println(brand + " " + model + " is moving at " + currentSpeed + " km/h.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " has stopped.");
    }

    public void shiftUp() {
        if (currentGear < largestGear) {
            currentGear++;
            updateSpeed();
            System.out.println(brand + " " + model + " shifted up to gear " + currentGear + ", speed is now " + currentSpeed + " km/h.");
        } else {
            System.out.println(brand + " " + model + " is already in the highest gear.");
        }
    }
    
    public void shiftDown() {
        if (currentGear > leastGear) {
            currentGear--;
            updateSpeed();
            System.out.println(brand + " " + model + " shifted down to gear " + currentGear + ", speed is now " + currentSpeed + " km/h.");
        } else {
            System.out.println(brand + " " + model + " is already in the lowest gear.");
        }
    }
    
    public void ringBell() {
        if (hasBell) {
            System.out.println(brand + " " + model + " is ringing the bell!");
        } else {
            System.out.println(brand + " " + model + " has no bell to ring.");
        }
    }

    public void lubricateChain() {
        isLubricated = true;
        updateSpeed();
        System.out.println(brand + " " + model + " chain is now lubricated, speed updated to " + currentSpeed + " km/h.");
    }

    public void checkSpeed() {
        System.out.println(brand + " " + model + "'s current speed is " + currentSpeed + " km/h.");
    }
    
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle("Giant", "Siu7", 1801, "Blue");
        bike1.move();
        bike1.shiftUp();
        bike1.checkSpeed();
        bike1.lubricateChain();
        bike1.checkSpeed();
        bike1.stop();

        Bicycle bike2 = new Bicycle("Trek", "Man8", 0001, "Red", 1, 10);
        bike2.move();
        bike2.shiftUp();
        bike2.checkSpeed();
        bike2.ringBell();
        bike2.checkSpeed();
        bike2.stop();

        Bicycle bike3 = new Bicycle("Specialized", "CC9", 2024, "Green", 1, 15, true);
        bike3.move();
        bike3.shiftUp();
        bike3.checkSpeed();
        bike3.lubricateChain();
        bike3.checkSpeed();
        bike3.stop();
    }
}
