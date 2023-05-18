public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Отдел №" + name;
    }

    public static void main(String[] args) {
        Department department = new Department("Отдел №");
        System.out.println(department);
    }
}
