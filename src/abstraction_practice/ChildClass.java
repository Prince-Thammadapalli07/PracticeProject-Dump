package abstraction_practice;

public class ChildClass extends AbstractClass{

    @Override
    public void hello() {
        System.out.println("My Name is "+name+" and I am "+age);
    }
}
