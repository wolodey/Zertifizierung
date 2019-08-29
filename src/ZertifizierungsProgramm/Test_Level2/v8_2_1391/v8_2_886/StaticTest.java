package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_886;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class StaticTest {
    void m1() {
        StaticTest.m2();
        m4();
       // StaticTest.m3();
    }

    static void m2() {}

    void m3() {
        m1();
        m2();
     //  StaticTest.m1();
    }

    static void m4() {}
}
