public class Employee {
    private static int id;
    private String fullNameEmployee;
    private Integer salary;
    private Department department;

    public Employee(int id, String fullNameEmployee, Integer salary, Department department) {
        this.id = id;
        this.fullNameEmployee = fullNameEmployee;
        this.salary = salary;
        this.department = department;
    }

    public static int getId() {
        return id;
    }

    public String getFullNameEmployee() {
        return fullNameEmployee;
    }

    public Integer getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setFullNameEmployee(String fullNameEmployee) {
        this.fullNameEmployee = fullNameEmployee;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                "fullNameEmployee='" + fullNameEmployee + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
