package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1097;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class TestClass {
    public static void main(String[] args) throws Exception {

        try{
            amethod();
            System.out.println("try ");
        } catch (Exception e) {
            System.out.println("catch ");
        } finally {
            System.out.println("finally ");
        }
        System.out.println("out ");
    }

    public static void amethod() {}
}
