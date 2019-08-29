package TestPackage.Kapitel4.Aufgabe15;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class Test {
    public void print(byte x) {
        System.out.println("byte");
    }
    public void print(int x) {
        System.out.println("int");
    }
    public void print(float x) {
        System.out.println("float");
    }
    public void print(Object x) {
        System.out.println("Object");
    }

    public void print(int ...x) {
        System.out.println("intintint");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        t.print(s);
        t.print(true);
        t.print(43.234);
        t.print(23L);
        t.print(23,34,234,234,234,234);
    }
}
