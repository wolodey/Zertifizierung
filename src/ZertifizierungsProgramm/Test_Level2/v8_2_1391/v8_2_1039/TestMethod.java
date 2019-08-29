package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1039;

/**
 * Created by WSteinle on 27.01.2017.
 */
public class TestMethod {
    public int transformNumber(int n) {
        int radix = 2;
        int output = 0;
        output += radix*n;
        radix = output/radix;
        if(output < 14) {
            return output;
        } else {
            output = output*radix/2;
            return output;
        }
    }

    public static void main(String[] args) {
        System.out.println(new TestMethod().transformNumber(7));
    }
}
