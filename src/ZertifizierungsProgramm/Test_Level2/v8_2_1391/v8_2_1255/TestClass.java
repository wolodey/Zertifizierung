package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1255;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        int i = 0;
        loop: {
            System.out.println("Loop Lable Line");
            try{
                for( ; true; i++) {
                    if(i > 5) break loop;
                }
            } catch (Exception e) {
                System.out.println("Exception in loop.");
            }finally {
                System.out.println("In Finally");
            }
        }
    }
}
