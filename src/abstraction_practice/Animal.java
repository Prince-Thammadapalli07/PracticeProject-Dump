package abstraction_practice;

abstract class Animal {
    String name;

    Animal(String name){
        this.name = name;
    }

    void eat() {
        System.out.println("Eating");
    }

    abstract void sound();
}
