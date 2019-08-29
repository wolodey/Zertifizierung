package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1817;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> function = x -> x.length();
        Consumer<Integer> consumer = x -> System.out.println("Len: " + x + " ");
        stringList.stream().map(function).forEach(consumer);
    }
}
