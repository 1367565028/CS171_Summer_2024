package Lab1_Michael_Zhao;

public class University {
    private String universityName;
    private String universityLocation;

    public University(String name, String location) {
        this.universityName = name;
        this.universityLocation = location;
    }

    public University(String name) {
        this.universityName = name;
        this.universityLocation = "In the middle of nowhere";// Default Value
    }

    public University() {
        this.universityName = "Emory";
        this.universityLocation = "Atlanta";
    }

    public String getName() {
        return this.universityName;
    }

    public String getLocation() {
        return this.universityLocation;
    }

    public void setName(String name) {
        this.universityName = name;
    }

    public void setLocation(String location) {
        this.universityLocation = location;
    }

    public void show() {
        System.out.println("University Name: " + universityName);
        System.out.println("University Location: " + universityLocation);
    }

    public static void main(String[] args) {
        // Lets test all the constructors
        University university1 = new University("MIT", "Cambridge");
        University university2 = new University("Cornell");
        University university3 = new University();

        university1.show();
        university2.show();
        university3.show();
    }
}
