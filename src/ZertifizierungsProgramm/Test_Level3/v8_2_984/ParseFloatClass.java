package ZertifizierungsProgramm.Test_Level3.v8_2_984;

/**
 * Created by WSteinle on 01.02.2017.
 */
public class ParseFloatClass {
    public float parseFloat(String s){
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid input " + s);
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("finally");
        }
        //return f;
    }
}
