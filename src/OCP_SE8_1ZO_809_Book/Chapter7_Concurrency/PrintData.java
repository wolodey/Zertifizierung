package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency;

/**
 * Created by WSteinle on 24.03.2017.
 */
public class PrintData implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record: " + i);
        }
    }

    public static void main(String[] args) {
        (new Thread(new PrintData())).start();
    }
}
