package TestPackage.Kapitel6.Aufgabe20;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();

        } catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");

        } catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");

        } finally {
            System.out.print("e");
            throw new RuntimeException("3");
        }
    }
}
