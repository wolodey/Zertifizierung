package ZertifizierungsProgramm.Test_Level1.v8_2_1155;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        String s = "minimum";
        System.out.println(s.substring(4, 7));
        System.out.println(s.substring(5));
        System.out.println(s.substring(s.indexOf('i', 3)));
        //System.out.println(s.substring(s.indexOf('i', 4)));
    }
}
