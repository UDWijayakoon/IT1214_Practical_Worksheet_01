class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + (0.10 * salary));
    }
}