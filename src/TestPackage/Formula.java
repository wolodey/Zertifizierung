package TestPackage;

/**
 * Created by WSteinle on 11.10.2016.
 */
public interface Formula {
    double calculate(int a);


    default double sqrt(int a) {
        return Math.sqrt(a);
    }


}
