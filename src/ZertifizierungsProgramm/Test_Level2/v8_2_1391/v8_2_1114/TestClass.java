package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1114;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class TestClass {

    int x = 5;
    int getX() {

        return x;
    }
    public void looper() {
        int x = 0;
        while ((x = getX()) != 0) {
            for(int m = 10; m >= 0; m--) {
                x = m;
            }
        }
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.looper();
        System.out.println(tc.x);

    }
}
