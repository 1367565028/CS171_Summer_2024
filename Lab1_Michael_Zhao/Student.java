package Lab1_Michael_Zhao;

public class Student {
    private String studentName;
    private String studentId;
    private String studentDepartment;
    public Student(String name, String id, String department) {
        this.studentName = name;
        this.studentId = id;
        this.studentDepartment = department;
    }
    public Student(String name, String id) {
        this.studentName = name;
        this.studentId = id;
        this.studentDepartment = "BBA";// Default Value
    }
    public Student(String name) {
        this.studentName = name;
        this.studentId = "003";// Default Value
        this.studentDepartment = "Biology";// Default Value
    }
    public Student() {
        this.studentName = "William";// Default Value
        this.studentId = "004";// Default Value
        this.studentDepartment = "LAW";// Default Value
    }
    public String getName() {
        return this.studentName;
    }
    public String getId() {
        return this.studentId;
    }
    public String getDepartment() {
        return this.studentDepartment;
    }
    public void setName(String name) {
        this.studentName = name;
    }
    public void setId(String id) {
        this.studentId = id;
    }
    public void setDepartment(String department) {
        this.studentDepartment = department;
    }
    public void show() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Department: " + studentDepartment);
    }
    public static void main(String[] args) {
        // Lets test all the constructors
        Student student1 = new Student("Michael Zhao", "001", "Computer Science");
        Student student2 = new Student("James","002");
        Student student3 = new Student("Nate");
        Student student4 = new Student();
        
        student1.show();
        student2.show();
        student3.show();
        student4.show();
    }
}




