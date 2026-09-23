package abstraction_practice;

public class InterfaceChildClass implements InterfaceClass{

    @Override
    public void speak() {
        InterfaceClass.super.speak();
    }

    static void main() {
        InterfaceChildClass childClass = new InterfaceChildClass();
        childClass.speak();
    }


}
