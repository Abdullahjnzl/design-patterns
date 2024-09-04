package structural.composite;

public class IndividualEmployee implements Employee {
    private String name;
    private double salary;

    public IndividualEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
