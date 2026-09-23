package random_practice_problems;

public class Employee {
    String id;
    String name;
    int age;
    String dept;
    int salary;

    public Employee(){};

    public Employee(String name, int age, String dept, int salary) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.salary = salary;
    }

    final void method(){
        System.out.println("This is final method");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
