package ZertifizierungsProgramm.Test_Level1.v8_2_1038;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;

        bool = (bool2 & method1(i++));
        bool = (bool2 && method1(i++));
        bool = (bool1 | method1(i++));
        bool = (bool1 || method1(i++));

        System.out.println(i);
    }


    public static boolean method1(int i) {
        return i>0 ? true : false;
    }
}
