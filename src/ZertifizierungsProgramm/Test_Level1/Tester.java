package ZertifizierungsProgramm.Test_Level1;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class Tester {
    public static void main(String[] args) {
        StringWrapper sw = new StringWrapper("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");

        System.out.println("Hello, " + sw);
        System.out.println("Hello, " + sb);
    }
}
