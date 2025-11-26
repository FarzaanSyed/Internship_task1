package OOPs.Task-1;

public class Employee extends Person {

    Employee(int id, String name, int age) {
        super(id, name, age);
    }
    @Override
    public void work() {
        System.out.println("Employee are Working");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Farzaan", 21);
        employee1.printDetails();
        employee1.work();

    }
}
