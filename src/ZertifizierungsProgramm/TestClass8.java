package ZertifizierungsProgramm;

/**
 * Created by WSteinle on 24.01.2017.
 */
abstract class TestClass8 {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("calculation");
        TestClass8 x = null;
        x.calculate();

    }
}
