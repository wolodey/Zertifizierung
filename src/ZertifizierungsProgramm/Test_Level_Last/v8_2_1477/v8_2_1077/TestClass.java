package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1077;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestClass {
    static boolean b;
    static int[] ia = new int[1];
    static char ch;
    static boolean[] ba = new boolean[1];

    public static void main(String[] args) {
        boolean x = false;
        if(b) {
            x = (ch == ia[ch]);
        } else x = (ba[ch] = b);
        System.out.println(x+ " " + ba[ch]);
    }
}
