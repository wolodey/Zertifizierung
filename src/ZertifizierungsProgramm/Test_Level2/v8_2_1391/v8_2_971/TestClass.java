package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_971;

/**
 * Created by WSteinle on 27.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        int i = 0;
        int[] iA = {10, 20};
        iA[i] = i = 30;
        System.out.println("" + iA[0] + " " + iA[1] + " " + i);
    }
}
