package OCP_SE8_1ZO_809_Book.ExamEssentials.Kap3;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Created by WSteinle on 15.12.2017.
 */
public class Aufgabe8 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");

        tree.forEach(System.out ::println);

    }
}
