package Lab1_Michael_Zhao;

public class Teacher {
 private String teacherName;
 private String teacherId;
 private String teacherDepartment;

 public Teacher(String name, String id, String department) {
     this.teacherName = name;
     this.teacherId = id;
     this.teacherDepartment = department;
 }

 public Teacher(String name, String id) {
     this.teacherName = name;
     this.teacherId = id;
     this.teacherDepartment = "Mathematics";// Default Value
 }

 public Teacher(String name) {
     this.teacherName = name;
     this.teacherId = "T003";// Default Value
     this.teacherDepartment = "Physics";// Default Value
 }

 public Teacher() {
     this.teacherName = "Dr. Smith";// Default Value
     this.teacherId = "T004";// Default Value
     this.teacherDepartment = "Chemistry";// Default Value
 }

 public String getName() {
     return this.teacherName;
 }

 public String getId() {
     return this.teacherId;
 }

 public String getDepartment() {
     return this.teacherDepartment;
 }

 public void setName(String name) {
     this.teacherName = name;
 }

 public void setId(String id) {
     this.teacherId = id;
 }

 public void setDepartment(String department) {
     this.teacherDepartment = department;
 }

 public void show() {
     System.out.println("Teacher Name: " + teacherName);
     System.out.println("Teacher ID: " + teacherId);
     System.out.println("Teacher Department: " + teacherDepartment);
 }

 public static void main(String[] args) {
     // Lets test all the constructors
     Teacher teacher1 = new Teacher("Dr. John Doe", "T001", "Computer Science");
     Teacher teacher2 = new Teacher("Dr. Jane Roe", "T002");
     Teacher teacher3 = new Teacher("Dr. Anna Smith");
     Teacher teacher4 = new Teacher();

     teacher1.show();
     teacher2.show();
     teacher3.show();
     teacher4.show();
 }
}
