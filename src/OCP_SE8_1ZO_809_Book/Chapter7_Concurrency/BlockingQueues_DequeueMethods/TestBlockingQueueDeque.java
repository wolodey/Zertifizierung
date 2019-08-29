package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.BlockingQueues_DequeueMethods;

import java.sql.Time;
import java.util.concurrent.*;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class TestBlockingQueueDeque {
    public static void main(String[] args) {
        //Testing BlockingQueue waiting methods

        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);
            blockingQueue.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            // Handle interruption
            System.out.println("Exception!!!");
        }

        System.out.println("Now testing the BlockingDeque waiting methods ");
        //Testing BlockingDeque waiting methods
        try {
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            //Handle Exception
        }
    }
}
