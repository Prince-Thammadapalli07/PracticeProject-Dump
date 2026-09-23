package abstraction_practice;

public class AbstractMain {

    static void main() {
        AbstractClass ab = new ChildClass();
        ab.name = "Prince";
        ab.age = 28;

        ab.hello();

        Animal cat = new Cat("Bobby");
        cat.eat();
        cat.sound();
    }
}
