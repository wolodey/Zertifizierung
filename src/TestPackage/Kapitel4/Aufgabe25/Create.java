package TestPackage.Kapitel4.Aufgabe25;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class Create {
    Create() {
        System.out.println("1 ");
    }

    Create(int num) {
        System.out.println("2 ");
    }

    Create(Integer num) {
        System.out.println("3 ");
    }

    Create(Object num) {
        System.out.println("4 ");
    }

    Create(int ...num) {
        System.out.println(" 5");
    }

    public static void main(String[] args) {
        new Create(1000L);
    }
}
