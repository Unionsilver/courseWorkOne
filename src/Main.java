public class Main {
    private static final Employee[] employee = new Employee[10];

    public static void main(String[] args) {

        Employee employee1 = new Employee("Одинцов Осип Евгеньевич", 1, 10000);
        Employee employee2 = new Employee("Денисов Артем Мэлсович", 2, 20000);
        Employee employee3 = new Employee("Большаков Герасим Гордеевич", 3, 30000);
        Employee employee4 = new Employee("Калинин Оскар Геннадьевич", 4, 40000);
        Employee employee5 = new Employee("Коновалов Виталий Лукьевич", 5, 50000);
        Employee employee6 = new Employee("Никитин Флор Георгьевич", 4, 60000);
        Employee employee7 = new Employee("Кабанов Александр Андреевич", 3, 70000);
        Employee employee8 = new Employee("Семёнов Григорий Филиппович", 2, 80000);
        Employee employee9 = new Employee("Егоров Аверкий Георгьевич ", 1, 90000);
        Employee employee10 = new Employee("Филатов Исаак Германович ", 1, 100000);

        employee[0] = employee1;
        employee[1] = employee2;
        employee[2] = employee3;
        employee[3] = employee4;
        employee[4] = employee5;
        employee[5] = employee6;
        employee[6] = employee7;
        employee[7] = employee8;
        employee[8] = employee9;
        employee[9] = employee10;
        allInfo();
        fullName();
        spendSalary();
        calculateEmployeeMinSalary();
        calculateEmployeeMaxSalary();
        System.out.println(spendSalary());
        averageSalaryMonth();

    }

    public static void allInfo() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }

    public static float spendSalary() {
        float num = 0.0f;
        for (int i = 0; i < employee.length; i++) {
            num += employee[i].getSalary();
        }
        return num;


    }

    public static float averageSalaryMonth() {
        float month = 0.0f;
        float monthDays = 30.0f;
        for (int i = 0; i < employee.length; i++) {
            month = spendSalary() / monthDays;
        }
        System.out.println(month);
        return month;
    }


    public static Employee calculateEmployeeMinSalary() {
        Employee min = employee[0];

        for (int j = 0; j < employee.length; j++) {
            if (employee[j].getSalary() < min.getSalary()) {
                min = employee[j];
            }
        }
        return min;
    }

    public static Employee calculateEmployeeMaxSalary() {
        Employee max = employee[0];
        for (int j = 0; j < employee.length; j++) {
            if (employee[j].getSalary() > max.getSalary()) {
                max = employee[j];
            }
        }
        return max;
    }

    public static void fullName() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }
}



