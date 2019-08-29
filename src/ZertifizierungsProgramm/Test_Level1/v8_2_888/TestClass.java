package ZertifizierungsProgramm.Test_Level1.v8_2_888;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class TestClass {
    public static void main(String[] args) throws Exception{
        A a = new A();
        AA aa = new AA();
        a = aa;
        System.out.println("a = " + a.getClass());
        System.out.println("a = " + a.getClass());
    }
}
