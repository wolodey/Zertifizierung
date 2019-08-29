package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1461;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class ParamTest {
    public static void printSum(double a, double b) {
        System.out.println("In double "  + (a+b));
    }

    public static void printSum(float a, float b) {
        System.out.println("in float " + (a+b));
    }

    public static void printSum(int a, int b) {
        System.out.println(("In int " + (a+b)));
    }

    public static void printSum(byte a, byte b) {
        System.out.println("In byte " + (a+b));
    }

    public static void main(String[] args) {
        printSum((byte)1,(byte) 2);
    }
}
