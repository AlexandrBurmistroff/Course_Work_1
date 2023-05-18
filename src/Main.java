public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов Иван Иванович", 75_000, 1);
        employees[1] = new Employee("Петров Пётр Петрович", 29_000, 2);
        employees[2] = new Employee("Конин Анатолий Петрович", 30_000, 3);
        employees[3] = new Employee("Панин Семён Сергеевич", 35_000, 4);
        employees[4] = new Employee("Семёнов Андрей Павлович", 27_000, 5);
        employees[5] = new Employee("Борин Александр Михайлович", 28_000, 5);
        employees[6] = new Employee("Горин Виктор Викторович", 36_000, 4);
        employees[7] = new Employee("Дорин Михаил Евгеньевич", 30_000, 3);
        employees[8] = new Employee("Лорин Александр Рубенович", 28_000, 2);
        employees[9] = new Employee("Сорин Алексей Григорьевич", 70_000, 1);

        for (Employee totalEmployee : employees) {
            System.out.println(totalEmployee);
        }
        System.out.println("-----------------------");

        System.out.println("Сумма затрат за месяц: " + countTotalSalary(employees));
        System.out.println("-----------------------");

        System.out.println("Минимальная зарплата: " + findMinSalary(employees));
        System.out.println("-----------------------");

        System.out.println("Максимальная зарплата: " + findMaxSalary(employees));
        System.out.println("-----------------------");

        System.out.println("Средняя зарплата: " + countAverageSalary(employees));
        System.out.println("-----------------------");

        System.out.println(getTotalFullName(employees));

    }
    public static int countTotalSalary(Employee[] employees) {
        int totalSum = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSum = totalSum + employees[i].getSalary();
        }
        return totalSum;
    }

    public static int findMinSalary(Employee[] employees) {
        int sumMin = 100000;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < sumMin) {
                sumMin = employees[i].getSalary();
            }
        }
        return sumMin;
    }

    public static int findMaxSalary(Employee[] employees) {
        int sumMax = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > sumMax) {
                sumMax = employees[i].getSalary();
            }
        }
        return sumMax;
    }

    public static int countAverageSalary(Employee[] employees) {
        int totalSum = 0;
        int averageSum = 0;
        for (int i = 0; i < employees.length; i++) {
            totalSum = totalSum + employees[i].getSalary();
            averageSum = totalSum / 10;
        }
        return averageSum;
    }

    public static String getTotalFullName(Employee[] employees) {
        String totalName = "";
        for (int i = 0; i < employees.length; i++) {
            totalName = employees[i].getFullNameEmployee();
            System.out.println(totalName);
        }
        return totalName;
    }
}

