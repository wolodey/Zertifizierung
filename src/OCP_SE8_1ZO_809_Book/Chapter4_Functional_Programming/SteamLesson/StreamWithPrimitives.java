package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by WSteinle on 16.03.2017.
 */
public class StreamWithPrimitives {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(1, (a, b) -> a + b));

        //we concert our Stream<Integer> to an IntStream and aske the IntStream
        //to calculate the sum for us.
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println(stream2.mapToInt(x -> x).sum());


        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble());

        //Empty Stream
        DoubleStream emptyStream = DoubleStream.empty();

        //creating infinite streams
        DoubleStream randomStream = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(0.5, d -> d / 2);
        randomStream.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);


    }
}
