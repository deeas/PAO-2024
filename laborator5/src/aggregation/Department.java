package aggregation;

public class Department {
    private String name;
    private Employee[] employee;

    public Department(String name, Employee[] employee) {
        this.name = name;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }
}
