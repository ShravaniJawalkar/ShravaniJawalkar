public class EmployeeProxy implements Employee {
    private Employee employee;
    private boolean isAdmin;

    public EmployeeProxy(String name, String empId, String empAddress, boolean isAdmin) {
        this.employee = new EmployeeDao(name, empId, empAddress);
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean create() {
        System.out.println("Proxy: Checking access before delegating to the real employee.");
        if(isAdmin) {
            System.out.println("Proxy: Logging the work done by the real employee.");
            return employee.create();
        } else {
            System.out.println("Proxy: Access denied.");
            return false;
        }


    }
}