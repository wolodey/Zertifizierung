package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1350;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        Float f = null;
        try{
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s);
            System.out.println("i = " + i);
        } catch (Exception e) {
            System.out.println("trouble : " + f);
        }

    }

}
