package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_899;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        B b = new B();
        A a = b;
        I i = a;

        System.out.println(b);
        System.out.println((B)a);
        System.out.println(i);
    }
}
