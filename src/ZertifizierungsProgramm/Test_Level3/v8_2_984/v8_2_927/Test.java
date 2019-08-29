package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_927;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int k = 1;
        int[] a = {1};
        k += (k=4) * (k+2);
        a[0] += (a[0] = 4) * (a[0] + 2);
        System.out.println(k + " " + a[0]);
    }
}
