package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1912;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 * Created by WSteinle on 22.03.2017.
 */
public class TestClass {
    public static int operate(IntUnaryOperator intUnOperator){
        return intUnOperator.applyAsInt(5);
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a-> b->a-b;

        int x = operate(fo.apply(20));
        System.out.println(x);
    }
}
