package abstractFactoryPattern;

import abstractfactory.pattern.demo.ActionMovieFactory;
import abstractfactory.pattern.demo.ComedyMovieFactory;
import abstractfactory.pattern.demo.IBollywoodMovie;
import abstractfactory.pattern.demo.ITollywoodMovie;

/**
 * Created by WSteinle on 08.12.2017.
 */
public class AbstractFactoryPatternEx {
    public static void main(String[] args) {
        System.out.println("***Abstract Factory Pattern Demo***");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.GetTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.GetBollywoodMovie();

        System.out.println("\nAction movies are:");
        System.out.println(tAction.MovieName());
        System.out.println(bAction.MovieName());

        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.GetTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.GetBollywoodMovie();

        System.out.println("\nComedy movies are:");
        System.out.println(tComedy.MovieName());
        System.out.println(bComedy.MovieName());
    }
}
