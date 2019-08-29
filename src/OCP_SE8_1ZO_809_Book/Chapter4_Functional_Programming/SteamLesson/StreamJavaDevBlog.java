package OCP_SE8_1ZO_809_Book.Chapter4_Functional_Programming.SteamLesson;

import java.util.stream.Stream;

/**
 * Created by WSteinle on 14.03.2017.
 */
public class StreamJavaDevBlog {
    public static void main(String[] args) {
        Stream.of("c1", "c2", "c3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);


        Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .filter(s -> {
                    System.out.println("Filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("Печатать с использованием forEach: " + s));
    }
}
