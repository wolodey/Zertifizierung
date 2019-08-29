package TestPackage.Kapitel5.Aufgabe12.Aufgabe13;

/**
 * Created by WSteinle on 20.01.2017.
 */
public class Spider extends Arthropod {
    public void printName(int input) {
        System.out.println("Spider");
    }

    public static void main(String[] args) {
        Spider spider = new Spider();
        spider.printName(4);
        spider.printName(9.0);
    }
}
