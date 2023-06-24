public class Employee {
    private final String fullName;
    private int department;
    private double salary;
    private static int counter = 1;
    private final int id;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;

    }

    public String getFullName() {

        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "id " + getId() + ". ФИО -  " + getFullName() + ", отдел " + getDepartment() + ", зарплата " +
                getSalary();
    }
}
