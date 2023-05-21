public class EmployeeService {
    private Employee[] employees;
    private Employee[] tmp;

    public EmployeeService(Employee[] employees) {
        this.employees = employees;
        tmp = new Employee[employees.length];
    }

    public Employee[] getEmployeesByDepartment(int department) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].equals(department)) {
                tmp[i] = employees[i];
            }
        }
        return result(tmp);

    }

    public Employee[] getEmployeesBySalaryGT(int salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                tmp[i] = employees[i];
            }
        }
        return result(tmp);
    }

    public Employee[] getEmployeesByNameLike(String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getFullNameEmployee().contains(name)) {
                tmp[i] = employees[i];
            }
        }
        return result(tmp);
    }
    public Employee getMaxByDepartment(int department) {
        Employee[] employeesByDepartment = getEmployeesByDepartment(department);
        return getMaxSalaryEmployee(employeesByDepartment);
    }

    public Employee getMax() {
        return getMaxSalaryEmployee(employees);
    }

    public Employee getMaxBySalaryGT(int salary) {
        Employee[] employeesBySalaryGT = getEmployeesBySalaryGT(salary);
        return getMaxSalaryEmployee(employeesBySalaryGT);
    }

    public Employee getMaxByNameLike(String name) {
        Employee[] employeesByNameLike = getEmployeesByNameLike(name);
        return getMaxSalaryEmployee(employeesByNameLike);
    }

    private Employee getMaxSalaryEmployee(Employee[] employees) {
        int max = employees[0].getSalary();
        Employee employee = null;
        for (int i = 1; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
                employee = employees[i];
            }
        }
        return employee;

    }

    private Employee[] result(Employee[] tmp) {
        int count = 0;
        for (Employee employee : tmp) {
            if (employee != null) count++;
        }
        Employee[] result = new Employee[count];
        for (int i = 0, j = 0; i < tmp.length; i++) {
            if (tmp[i] != null) {
                result[j++] = tmp[i];
            }
            tmp[i] = null;
        }
        return result;
    }
}
