package TestPackage.Kapitel6.Aufgabe12;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Mouse {
    public String name;
    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
    }

    public static void main(String[] args) {
        Mouse jerry = new Mouse();
       // jerry.name = "jerry";
        jerry.run();
        System.out.print("6");


    }
}
