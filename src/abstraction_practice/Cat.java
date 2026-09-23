package abstraction_practice;

public class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Meow!");
    }
}
