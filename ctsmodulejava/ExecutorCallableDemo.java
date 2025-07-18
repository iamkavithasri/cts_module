import java.util.*;
import java.util.concurrent.*;

public class ExecutorCallableDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        List<Callable<Integer>> tasks = new ArrayList<>();
        for (int i = 1; i <= 5; ++i)
            tasks.add(() -> (int)(Math.random()*100));
        List<Future<Integer>> results = pool.invokeAll(tasks);
        for (Future<Integer> f : results)
            System.out.println("Result: " + f.get());
        pool.shutdown();
    }
}
