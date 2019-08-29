package TestPackage.Kapitel4.Aufgabe22;

/**
 * Created by WSteinle on 18.01.2017.
 */
public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " ");
        System.out.print(Order.result + " ");
        new Order();
        new Order();
        System.out.println(Order.result + " ");
    }
}
