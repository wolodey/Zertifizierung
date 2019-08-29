package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1766;

import java.util.function.Supplier;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class ToUpperCaseExample {
    public static void main(String[] args) {
        String name = "bob";
        String val = null;

        Supplier<String> supplier = name :: toUpperCase;
        System.out.println(supplier.get());

        //Function<String, Locale> function = name :: toUpperCase;
    }

}
