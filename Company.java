package Task6;

public class Company {
    private String name;
    private String department;
    private double salary;

    Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getName(), this.getDepartment(), this.getSalary());
    }
}

