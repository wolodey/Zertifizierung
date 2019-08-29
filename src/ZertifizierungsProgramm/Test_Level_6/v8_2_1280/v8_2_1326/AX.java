package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_1326;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class AX {
    static int[] x = new int[1];
    static{
        x[0] = 10;
    }

    static char abcd;

    public static void main(String[] args) {
        AX ax = new AX();
        System.out.println(x[0]);

        int x = 10;
        double b = 1 - x/100*1 - x/100;
        System.out.println(b);

        System.out.println(1+5 < 3+7);
        System.out.println((2+2) >= 2+3);

        System.out.println(abcd);
    }
}
