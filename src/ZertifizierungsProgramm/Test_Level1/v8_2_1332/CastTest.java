package ZertifizierungsProgramm.Test_Level1.v8_2_1332;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class CastTest {
    public static void main(String[] args) {
        byte b = -128;
        System.out.println(b);
        int i = b;
        System.out.println(i);
        b = (byte) i;
        System.out.println(b);
    }
}
