package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1792;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,4,6,9,2,5,7);

        System.out.println(list.stream().reduce(Integer.MIN_VALUE, (a,b) -> a > b ? a : b));

       // System.out.println(list.stream().max(Integer :: max).get());

     //   System.out.println(list.stream().max(Integer :: compare).get());

      //  System.out.println(list.stream().max((a, b) -> a>b ? a : b));
    }
}
