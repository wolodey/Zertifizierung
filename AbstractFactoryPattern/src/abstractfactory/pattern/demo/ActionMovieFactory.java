package abstractfactory.pattern.demo;

/**
 * Created by WSteinle on 10.12.2017.
 */
//Action Movie Factory
public class ActionMovieFactory implements IMovieFactory {

    @Override
    public ITollywoodMovie GetTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie GetBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
