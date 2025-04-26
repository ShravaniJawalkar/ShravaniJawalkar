public final class ImmutableCLasses {
    private final String name;
    private final double salary;

    public ImmutableCLasses(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}