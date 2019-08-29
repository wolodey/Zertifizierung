package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.AtomicLesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by WSteinle on 28.03.2017.
 */
//Book Seite 350 (402)
public class SheepManager  {

    private int sheepCount = 0;

    private AtomicInteger sheepCountAtomic = new AtomicInteger(0);

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    //With Atomic
    private void incrementAndReportAtomic() {
        synchronized (this) {
            System.out.print(sheepCountAtomic.incrementAndGet() + " ");
        }
    }

    //Lesson Synchronized Block
    public static void printDaysWork() {
        synchronized (SheepManager.class) {
            System.out.println("Finished work");
        }
    }

    public void printDaysWorkNotStatic() {
        synchronized (this) {
            System.out.println("finished word");
        }
    }

    public static synchronized void printDaysWork2() {
        System.out.println("Finished work");
    }


    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);

            SheepManager manager = new SheepManager();
            for(int i=0; i<10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }

            System.out.println("Jetzt with Atomic");

            //with Atomic
            for(int i=0; i<10; i++) {
                service.submit(() -> manager.incrementAndReportAtomic());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
