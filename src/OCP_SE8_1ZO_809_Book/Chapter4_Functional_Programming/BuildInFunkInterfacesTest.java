package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

/**
 * Created by WSteinle on 08.03.2017.
 */
public class BuildInFunkInterfacesTest {

    public static void main(String[] args) {
//SUPPLIER -------------------------------------------------------------
        System.out.println("SUPPLIER");
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        System.out.println(s1.get());

        Supplier<StringBuilder> sb1 = () -> new StringBuilder();
        Supplier<StringBuilder> sb2 = StringBuilder::new;

//CONSUMER---------------------------------------------------------------
        System.out.println("CONSUMER");
        Consumer<String> consumer1 = System.out::println;
        Consumer<String> consumer2 = x -> System.out.println(x);
        consumer1.accept("Anna");
        consumer2.accept("Anna2");

        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chik", 1);

        System.out.println(map);

//PREDICATE---------------------------------------------------------------
        System.out.println("PREDICATE");
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test(""));
        System.out.println(p2.test(""));

        BiPredicate<String, String> biPredicate1 = String :: startsWith;
        BiPredicate<String, String> biPredicate2 = (str, prefix) -> str.startsWith(prefix);
        System.out.println(biPredicate1.test("chicken1", "chick1"));
        System.out.println(biPredicate2.test("chicken2", "chick2"));

        BiPredicate<String, String> ex1 = (bi1, bi2) -> false;
        BiPredicate<String, String> ex2 = (bi1, bi2) -> false;

//FUNCTION ----------------------------------------------------------------
        System.out.println("FUNCTION");
        Function<String, Integer> function1 = String::length;
        Function<String, Integer> function2 = x -> x.length();
        System.out.println(function1.apply("cluck"));
        System.out.println(function2.apply("clucks"));

    }
}
