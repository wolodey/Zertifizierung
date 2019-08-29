package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.searching_and_sorting;

import OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.comparable.Duck;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by WSteinle on 06.03.2017.
 */
public class UseTreeSet {
    static class Rabbit{ int id;}

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));
        Set<Rabbit> rabbit = new TreeSet<>(new Comparator<Rabbit>() {
            public int compare (Rabbit r1, Rabbit r2) {
                return r1.id - r2.id;
            }
        });

        rabbit.add(new Rabbit());
    }
}
