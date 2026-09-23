package random_practice_problems;

public class EagerInitializationSingleTon {
    private static final EagerInitializationSingleTon INSTANCE = new EagerInitializationSingleTon();

    private EagerInitializationSingleTon(){}

    public static EagerInitializationSingleTon getInstance(){
        return INSTANCE;
    }
}
