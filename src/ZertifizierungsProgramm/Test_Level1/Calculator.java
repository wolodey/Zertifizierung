package ZertifizierungsProgramm.Test_Level1;

/**
 * Created by WSteinle on 25.01.2017.
 */
public abstract class Calculator {
    abstract void calculate();

    public static void main(String[] args) {
        System.out.println("calculating");
        Calculator x = null;
        x.calculate();
    }
}
