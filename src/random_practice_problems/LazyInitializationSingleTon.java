package random_practice_problems;

public class LazyInitializationSingleTon {
    private static LazyInitializationSingleTon INSTANCE;

    private LazyInitializationSingleTon(){}

    private LazyInitializationSingleTon getInstance() {
        if (INSTANCE == null)  {
            INSTANCE = new LazyInitializationSingleTon();
        }
        return INSTANCE;
    }

}
