package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by WSteinle on 29.03.2017.
 */
//Book S 379 (431)
public class LionPenManager {
    private void removeAnimals() {
        System.out.println("Revoming animals");
    }
    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addAnimals() {
        System.out.println("Adding animals");
    }

    public void performTask(CyclicBarrier cyclicBarrier1, CyclicBarrier cyclicBarrier2) {
        try {
            removeAnimals();
            cyclicBarrier1.await();
            cleanPen();
            cyclicBarrier2.await();
            addAnimals();
        } catch (InterruptedException | BrokenBarrierException e) {
            //Handle checked exceptions here
        }
    }

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(4);
            LionPenManager manager = new LionPenManager();
            CyclicBarrier cyclicBarrier1 = new CyclicBarrier(4);
            CyclicBarrier cyclicBarrier2 = new CyclicBarrier(4, () -> System.out.println("*** Pen cleaned!"));
            for(int i = 0; i<4; i++) {
                service.submit(() -> manager.performTask(cyclicBarrier1, cyclicBarrier2));
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
