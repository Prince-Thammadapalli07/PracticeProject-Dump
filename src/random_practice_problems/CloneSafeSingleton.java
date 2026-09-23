package random_practice_problems;

public class CloneSafeSingleton implements Cloneable{
    private static final CloneSafeSingleton INSTANCE = new CloneSafeSingleton();
    
    private CloneSafeSingleton(){}

    public static CloneSafeSingleton getInstance(){
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}
