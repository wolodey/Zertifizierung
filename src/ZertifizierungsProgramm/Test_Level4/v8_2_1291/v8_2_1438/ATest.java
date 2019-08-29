package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1438;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class ATest {
    String global = "111";

    public int parse(String arg) {
        int value = 0;
        try{
            String global = arg; /// т.к это новое поле global
            value = Integer.parseInt(global);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
        System.out.println(global + " " + value + " ");
        return value;
    }

    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.println(ct.parse("333"));
    }
}
