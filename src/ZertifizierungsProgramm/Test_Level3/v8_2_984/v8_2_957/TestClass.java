package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_957;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class TestClass {
    static int someInt = 10;
    public static void changeIt(int a) {
        a = 20;
    }

    public static void main(String[] args) {
        changeIt(someInt);
        System.out.println(someInt);

        //System.out.println(true + null);
    }
}
