package Lab1_Michael_Zhao;

public class Department {
    private String departmentName;
    private String departmentCode;

    public Department(String name, String code) {
        this.departmentName = name;
        this.departmentCode = code;
    }

    public Department(String name) {
        this.departmentName = name;
        this.departmentCode = "D002"; // Default Value
    }

    public Department() {
        this.departmentName = "General Studies";
        this.departmentCode = "D001"; // Default Value
    }

    public String getName() {
        return this.departmentName;
    }

    public String getCode() {
        return this.departmentCode;
    }

    public void setName(String name) {
        this.departmentName = name;
    }

    public void setCode(String code) {
        this.departmentCode = code;
    }

    public void show() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Department Code: " + departmentCode);
    }

    public static void main(String[] args) {
        // Lets test all the constructors
        Department department1 = new Department("Computer Science", "CS");
        Department department2 = new Department("Mathematics");
        Department department3 = new Department();

        department1.show();
        department2.show();
        department3.show();
    }
}
