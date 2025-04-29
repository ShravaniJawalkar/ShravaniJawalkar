public class EmployeeDao implements Employee{
    private String name;
    private String empId;
    private String empAddress;

    public EmployeeDao(String name, String empId, String empAddress) {
        this.name = name;
        this.empId = empId;
        this.empAddress = empAddress;
    }

    @Override
    public boolean create() {
        System.out.println("Employee is created with below details :");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Address: " + empAddress);
        return true;
    }
}