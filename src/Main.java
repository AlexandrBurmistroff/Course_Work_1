import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        Department department1 = new Department("Отдел №1");
        Department department2 = new Department("Отдел №2");
        Department department3 = new Department("Отдел №3");
        Department department4 = new Department("Отдел №4");
        Department department5 = new Department("Отдел №5");

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(i, "fullName " + i, i * 100, (i % 3 == 0)? department3: department2);
            System.out.println(employees[i]);
        }
    }
}
