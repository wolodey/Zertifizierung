package ZertifizierungsProgramm.JavaBasicsTest.v8_2_1341.v8_2_1438;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class ATest {
    String global = "111";
     public int parse(String arg) {
         int value = 0;
         try {
             String global = arg;
             value = Integer.parseInt(global);
         }catch (Exception e) {
             System.out.print(e.getClass());
         }

         System.out.print(global + " " + value + " ");
         return value;
     }

    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.println(ct.parse("333"));
    }
}
