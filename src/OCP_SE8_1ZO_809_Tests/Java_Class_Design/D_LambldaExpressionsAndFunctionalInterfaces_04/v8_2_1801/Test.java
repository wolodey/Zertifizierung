package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1801;

import java.util.Arrays;
import java.util.List;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld"));

        messages.forEach(s-> {
            s.insert(5, ",");
            System.out.println(s);
        });

    }
}
