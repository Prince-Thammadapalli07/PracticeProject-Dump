package abstraction_practice;

public interface InterfaceClass {
    
    String name = "Prince";

    private String hello(){

        return name+" I speak Telugu";
    }

    default void speak(){
        System.out.println("I am person, I am "+hello());
    }


}
