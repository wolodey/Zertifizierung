package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1866;

import java.util.function.Function;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class TestClass {
    public double process (double payment, int rate) {
        double defaultrate = 0.10;
       // if (rate > 10) defaultrate = rate;

        class Implement {
            public int apply(double data) {
                //Function<Integer, Integer> f = x -> x + (int) (x*defaultrate);
                Function<Integer, Integer> f = x -> x + (int) (x*rate);
                //BiFunction<Integer, Double, Integer> f = (m, n) -> m + (int) (n*m);
                //return f.apply((int) data, defaultrate);
                return f.apply((int) data);
            }
        }

        Implement i = new Implement();
        return i.apply(payment);



    }
}
