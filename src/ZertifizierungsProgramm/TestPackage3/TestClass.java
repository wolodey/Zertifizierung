package ZertifizierungsProgramm.TestPackage3;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        A o1 = new C();
        B o2 = (B) o1;

        System.out.println(o1.m1());
        System.out.println(o2.i);
    }
}
