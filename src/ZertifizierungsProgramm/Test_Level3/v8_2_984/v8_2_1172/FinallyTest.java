package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1172;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class FinallyTest {
    public static void main(String[] args) {
        try{
            if(args.length == 0) return;
            else throw new Exception("Some Exception");
        } catch (Exception e) {
            System.out.println("Exception in main");
        } finally {
            System.out.println("The end");
        }


    }
}
