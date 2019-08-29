package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1252;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class TestClass {
    char c;
    public void m1() {
        char[] cA = {'a', 'b'};
        m2(c, cA);
        System.out.println(((int)c) + ", " + cA[1]);
    }
    public void m2(char c, char[] cA) {
        c = 'b';
        cA[1] = cA[0] = 'm';
    }

    public static void main(String[] args) {
        new TestClass().m1();
    }
}
