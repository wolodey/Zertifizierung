package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.PerformanceImprovements_Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 29.03.2017.
 */
public class WhaleDataCalculator {
    public int processRecord(int input) {
        try {
            //Thread.sleep() is used to simulate processing data
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        return input + 1;
    }

    public void processAllData(List<Integer> data) {
        //not parallel
     //   data.stream().map(a -> processRecord(a)).count();
        //Parallel -- performance improvement
        data.parallelStream().map(a -> processRecord(a)).count();

    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();

        //Define the data
        List<Integer> data = new ArrayList<Integer>();
        for(int i=0; i<4000; i++) {
            data.add(i);
        }

        //Process the data
        long start = System.currentTimeMillis();
        calculator.processAllData(data);
        double time = (System.currentTimeMillis() - start)/ 1000.0;

        //Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }
}
