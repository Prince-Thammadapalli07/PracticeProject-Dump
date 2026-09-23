package random_practice_problems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ImplementingCachingMechanism {

    private static Map<Integer, String> cache = new HashMap<>();

    private static final Map<Integer, String> concurrentCache = new ConcurrentHashMap<>();

    public static String getEmployeeId(int id){
        return concurrentCache.computeIfAbsent(id, c -> {
            System.out.println(Thread.currentThread().getName()+"fetching from db");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Employee"+c;
        });
    }



    static void main() {
        System.out.println(getEmployeeId(1));
        Runnable task = () -> {
            String emp = getEmployeeId(1);
            System.out.println(Thread.currentThread().getName()+"->"+emp);
        };
        new Thread(task, "Thread1").start();
        new Thread(task, "Thread2").start();
    }
}
