package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.ExecutorServiceLesson;

import java.util.concurrent.*;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for(int i=0; i<500; i++) CheckResults.counter++;
            });

            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached");
        } catch (TimeoutException e) {
            System.out.println("Not reached in time");
        } finally {
            if(service != null) service.shutdown();
        }
    }
}
