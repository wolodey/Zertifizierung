package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**eligible
 * Created by WSteinle on 13.03.2017.
 */
public class LearningStream {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "ape", "banono");
        System.out.println(s.count());


        //MIN() MAX()
        Optional<String> minStream = s.min((s1, s2) -> s1.length() - s2.length());
        minStream
                .ifPresent(System.out::println);

        //FindAny() FindFirst
        Stream<String> infinite = Stream.generate(()->"chimp");
        s.findAny()
                .ifPresent(System.out::println);
        infinite
                .findAny()
                .ifPresent(System.out::println);

       // s.forEach(System.out::println);

        Stream<Integer> infinite2 = Stream.iterate(1, x -> x+1);
        infinite2.limit(5)
                .peek(System.out::print)
                .filter(x -> x%2 == 1)
                .forEach(System.out::println);

        Stream<Integer> streamReduce = Stream.of(1, 2, 3);
        System.out.println(streamReduce.reduce(0, (a, b) -> a + b));



    }
}
