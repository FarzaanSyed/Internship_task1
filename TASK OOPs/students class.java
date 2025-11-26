package OOPs.Task-1;

public class Student extends Person
{

    Student(int id, String name, int age)
    {
        super(id, name, age);
    }
    @Override
    public void work() {
        System.out.println("Students are doing their internships ");
    }
    public static void main(String[] args) {
        Student student1 = new Student(01, "Farzaan Syed", 21);
        student1.printDetails();
        student1.work();
    }
}
