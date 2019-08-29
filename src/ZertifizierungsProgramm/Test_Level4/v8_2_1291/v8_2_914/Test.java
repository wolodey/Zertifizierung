package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_914;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int[] values = {10, 30, 50};
        for(int val : values) {
            int x = 0;
            while (x < values.length) {
                System.out.println(x + " " + val);
                x++;
            }
        }
    }
}
