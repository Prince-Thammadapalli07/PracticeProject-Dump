package random_practice_problems;

import java.util.Optional;
import java.util.concurrent.*;

public class LearningThreads {
    static void main() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(() -> {
            System.out.println("A Task");
        });

        executorService.shutdown();

        //callable example
        Callable<Integer> task = () -> 100;

        //Future interface
        Future<Integer> future = executorService.submit(task);
        System.out.println(future.get());

        String name = null;
        Optional<String> namee = Optional.ofNullable(name);
    }
}
