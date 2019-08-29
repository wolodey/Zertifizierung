package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.CallableVsSupplier;

import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Supplier;

/**
 * Created by WSteinle on 27.03.2017.
 */
public class AmbiguousLambdaSample {
    public static void useCallable(Callable<Integer> expression) {}

    public static void useSupplier(Supplier<Integer> expression) {}

    public static void use(Supplier <Integer> expression) {}
    public static void use(Callable <Integer> expressiong) {}

    public static void main(String[] args) {
        useCallable(() -> {throw new IOException();});

       // useSupplier(() -> {throw new IOException();}); //dont work!!!
       //use(() -> {throw new IOException();}); //dont work without explicit CAST
       use((Callable<Integer>)() -> {throw new IOException();});
    }
}
