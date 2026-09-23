package random_practice_problems;

public final class Student extends Employee{
    String name;
    int age;
    static final String bio;

    Student(){
        System.out.println("This is constructor");
    }
    static {
        bio = "";
        System.out.println("This is final block in student");
    }
    {
        System.out.println("Empty block");
    }
    static void main() {

        Student s = new Student();
        s.name = "Prince";
        new Employee().method();
    }
}
