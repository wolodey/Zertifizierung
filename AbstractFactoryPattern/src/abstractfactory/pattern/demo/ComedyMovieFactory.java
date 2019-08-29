package abstractfactory.pattern.demo;

/**
 * Created by WSteinle on 10.12.2017.
 */
//Comedy Movie Factory
public class ComedyMovieFactory implements IMovieFactory {

    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
