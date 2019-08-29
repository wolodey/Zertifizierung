package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency;

import java.io.File;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class CheckResults {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            for (int i = 0; i < 500; i++) CheckResults.counter++;
        }).start();

        while(CheckResults.counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000);
        }
        System.out.println("Reached");

        System.out.println("Separator " + File.separator);
        System.out.println(System.getProperty("file.separator"));
    }
}
