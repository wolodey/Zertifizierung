package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.SchedulesTaskLesson;

import java.util.concurrent.*;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class TestSchedulingTasks {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Runnable task1 = () -> System.out.println("Hello Zoo");

        Callable<String> task2 = () -> {
            System.out.println("hallo");
            return "Monkey";};

        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> future2 = service.schedule(task2, 1, TimeUnit.SECONDS);
    }
}
