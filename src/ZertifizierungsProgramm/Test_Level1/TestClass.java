package ZertifizierungsProgramm.Test_Level1;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());

        Super s1 = new Super();
        Sub s2 = new Sub();
        s1 = (Super) s2;

    }
}
