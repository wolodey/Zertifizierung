package ZertifizierungsProgramm.Working_with_methods.v8_2_1373.v8_2_886;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class StaticTest {
    void m1() {
        StaticTest.m2();
        m4();
        new StaticTest().m3();
    }

    static void m2() {}

    void m3(){
        this.m1();
        m2();
        new StaticTest().m1();
    }

    static void m4(){}

    void m33() {}
}
