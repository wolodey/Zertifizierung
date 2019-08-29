package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.ParallelStream_Lesson;

import java.util.Arrays;

/**
 * Created by WSteinle on 29.03.2017.
 */
public class ParallelStreamTest {
    public static void main(String[] args) {

        //Serial example of Stream
        Arrays.asList(1, 2, 3, 4, 5, 3, 6).stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.asList(1, 2, 3, 4, 5, 3, 6).stream().forEach(System.out::print);

        System.out.println();

        // Using a parallel Stream
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEach(System.out::print);
        System.out.println();

        // Ordering forEach Results with "forEachOrdered" method
        Arrays.asList(1, 2, 3, 4, 5, 6).parallelStream().forEachOrdered(s -> System.out.print(s + " "));


    }
}
