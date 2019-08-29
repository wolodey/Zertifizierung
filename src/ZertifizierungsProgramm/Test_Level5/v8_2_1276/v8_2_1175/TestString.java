package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1175;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class TestString {
    public static void main(String[] args) {
        boolean b = "String".replace('g', 'G') == "String".replace('g', 'G');
        boolean b2 = "String".replace('g', 'g') == "String";
        System.out.println(b);
        System.out.println(b2);

        char c = 97;
        System.out.println(c);

    }
}
