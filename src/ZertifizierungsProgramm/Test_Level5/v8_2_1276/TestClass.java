package ZertifizierungsProgramm.Test_Level5.v8_2_1276;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        try {
            tc.m1();
        } catch (MyException e) {
            try {
                tc.m1();
            } catch (MyException e1) {
                e1.printStackTrace();
            }
        } finally {
            tc.m2();
        }
    }

    public void m1() throws MyException {
        throw new MyException();
    }

    public void m2() throws RuntimeException {
        throw new NullPointerException();
    }
}
