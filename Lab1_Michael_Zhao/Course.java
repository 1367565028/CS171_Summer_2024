package Lab1_Michael_Zhao;

public class Course {
    private String courseName;
    private String courseCode;
    private int courseCredit;

    public Course(String name, String code, int credit) {
        this.courseName = name;
        this.courseCode = code;
        this.courseCredit = credit;
    }

    public Course(String name, String code) {
        this.courseName = name;
        this.courseCode = code;
        this.courseCredit = 3; // Default Value
    }

    public Course(String name) {
        this.courseName = name;
        this.courseCode = "Default Value";
        this.courseCredit = 3; // Default Value
    }

    public Course() {
        this.courseName = "Default Value";
        this.courseCode = "Default Value";
        this.courseCredit = 3; // Default Value
    }

    public String getName() {
        return this.courseName;
    }

    public String getCode() {
        return this.courseCode;
    }

    public int getCredit() {
        return this.courseCredit;
    }

    public void setName(String name) {
        this.courseName = name;
    }

    public void setCode(String code) {
        this.courseCode = code;
    }

    public void setCredit(int credit) {
        this.courseCredit = credit;
    }

    public void show() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Credit: " + courseCredit);
    }
    
    // now we use the show function to test if the code works
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures", "CS101", 4);
        Course course2 = new Course("Algorithms", "CS102");
        Course course3 = new Course("Discrete Math");
        Course course4 = new Course();

        course1.show();
        course2.show();
        course3.show();
        course4.show();
    }
    
}