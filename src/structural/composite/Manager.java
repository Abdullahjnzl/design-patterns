package structural.composite;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Manager implements Employee {
    private String name;
    private List<Employee> subordinates = new ArrayList<>();
    private double salary;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        double totalSalary = 0;
        totalSalary += salary;
        for (Employee employee : subordinates) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}