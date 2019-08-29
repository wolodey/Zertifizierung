package abstractfactory.pattern.demo;

/**
 * Created by WSteinle on 08.12.2017.
 */
public interface IMovieFactory {
    ITollywoodMovie GetTollywoodMovie();
    IBollywoodMovie GetBollywoodMovie();
}
