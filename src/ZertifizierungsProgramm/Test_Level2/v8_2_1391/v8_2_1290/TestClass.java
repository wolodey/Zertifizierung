package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1290;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class TestClass {
    static int mx(int s) {
        for(int i = 0; i < 3; i++) {
            s = s + i;
        }
        return s;
    }



    public static void main(String[] args) {
        int s = 5;
        s += s + mx(s) + ++s;
        System.out.println(mx(5));

        short ss = 12;
        long g = 012;
        float f = -1243;

        System.out.println(g);
    }
}
