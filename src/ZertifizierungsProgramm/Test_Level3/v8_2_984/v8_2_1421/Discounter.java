package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1421;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class Discounter {

    static double percent;
    int offset = 10, base = 50;
    public static double calc(double value) {
        int coupon, offset, base;
        if(percent < 10) {
            coupon = 15;
            offset = 20;
            base = 10;
        }
     //   return coupon*offset*base*value/100;
        return value/100;
    }


}
