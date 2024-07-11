package Lab1_Michael_Zhao;

public class PracticeNow {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Course course1 = new Course("Introduction to Java", "CS101", 4);
        Course course2 = new Course("Algorithms", "CS102");
        Course course3 = new Course("Data Structures");

        Student student1 = new Student("Alice Smith", "5678", "Computer Science");
        Student student2 = new Student("Bob Johnson", "6789");
        Student student3 = new Student("Charlie Brown");

        Department department1 = new Department("Computer Science", "CS");
        Department department2 = new Department("Mathematics");
        Department department3 = new Department();

        University university1 = new University("Harvard University", "Cambridge, MA");
        University university2 = new University("Stanford University");
        University university3 = new University();

        Teacher teacher1 = new Teacher("Prof. Jane Doe", "7890", "Computer Science");
        Teacher teacher2 = new Teacher("Dr. Mike Ross", "8901");
        Teacher teacher3 = new Teacher("Dr. Samantha Lee");

        System.out.println(student1.getName() + " is a student of " + student1.getDepartment() + " department of "
                + university1.getName() + " at " + university1.getLocation() + ". They are taking the course "
                + course1.getName() + " which has " + course1.getCredit() + " credits.");

        System.out.println(student2.getName() + " is a student of " + student2.getDepartment() + " department of "
                + university2.getName() + " at " + university2.getLocation() + ". Their course is "
                + course2.getName() + " which has " + course2.getCredit() + " credits.");

        System.out.println(teacher1.getName() + " is a teacher in the " + department1.getName() + " department of "
                + university3.getName() + ". The course " + course3.getName() + " is taught by them.");
    }
}
