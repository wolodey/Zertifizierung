package OCP_SE8_1ZO_809_Tests.Java_Class_Design.D_LambldaExpressionsAndFunctionalInterfaces_04.v8_2_1781;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class FilteringStuff {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("On the Waterfront", Movie.Genre.DRAMA),
                new Movie("Psycho", Movie.Genre.THRILLER),
                new Movie("Oldboy", Movie.Genre.THRILLER),
                new Movie("Shining", Movie.Genre.HORROR)

        );
        Predicate<Movie> horror = mov -> mov.getGenre() == Movie.Genre.THRILLER;
        Predicate<Movie> name = mov -> mov.getName().startsWith("O");

        movies.stream().filter(horror).forEach(mov -> System.out.println(mov.getName()));

        System.out.println();

        movies.stream().filter(horror).filter(name).forEach(mov -> System.out.println(mov.getName()));

    }
}
