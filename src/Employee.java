public class Employee {
    private int id;
    private static int counter;
    private String fullNameEmployee;
    private int salary;
    private int department;

    public Employee(String fullNameEmployee, int salary, int department) {
        this.id = counter++;
        this.fullNameEmployee = fullNameEmployee;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return this.id;
    }

    public String getFullNameEmployee() {
        return this.fullNameEmployee;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setFullNameEmployee(String fullNameEmployee) {
        this.fullNameEmployee = fullNameEmployee;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "id:" + id + " " +
                "ФИО: " + fullNameEmployee + " " +
                "Зарплата: " + salary + " " +
                "Отдел:" + department;
    }
}
