package random_practice_problems;

import java.io.Serial;
import java.io.Serializable;

public class SerializedSingleTon implements Serializable {

    private static final SerializedSingleTon INSTANCE = new SerializedSingleTon();

    private SerializedSingleTon(){}

    public static SerializedSingleTon getInstance() {
        return INSTANCE;
    }

    @Serial
    protected Object readResolve() {
        return INSTANCE;
    }

}
