package TestPackage.Kapitel4.Aufgabe23;

/**
 * Created by WSteinle on 18.01.2017.
 */
public class Order {

    String value = "t";
    {value += "a";}
    {value += "c";}
    public Order() {
        value += "b";
    }

    public Order(String s) {
        value += s;
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.value);
    }
}
