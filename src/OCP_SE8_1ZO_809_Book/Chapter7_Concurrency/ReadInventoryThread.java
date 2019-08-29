package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency;

/**
 * Created by WSteinle on 24.03.2017.
 */
public class ReadInventoryThread extends Thread {
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("ende");

        System.out.println("Anzahl Prozessoren = " + Runtime.getRuntime().availableProcessors());
    }
}
