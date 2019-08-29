package TestPackage.TestForOracle;

/**
 * Created by WSteinle on 18.01.2017.
 */
public class LearningStringBuilder {

    public static void main(String[] args) {
        StringBuilder b1 = new StringBuilder("snorkler");
        StringBuilder b2 = new StringBuilder("yoodler");

        b1.append(b2.substring(2, 5).toUpperCase());
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println();

        b2.insert(3, b1.append("a"));
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println();

        b1.replace(3, 4, b2.substring(4)).append(b2.append(false));
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
    }
}
