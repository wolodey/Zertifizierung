package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by WSteinle on 03.03.2017.
 */
public class Duck implements Comparable<Duck> {

    private String name;
    private int weight;
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public String getName() {return name;}
    public int getWeight() {return weight;}
    public String toString() {return name;}

    @Override
    public int compareTo(Duck ob) {
        return name.compareTo(ob.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();

        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddle", 10));
        ducks.add(new Duck("Alex", 12));
        Collections.sort(ducks);
        System.out.println(ducks);

        Collections.sort(ducks, byWeight);
        System.out.println(ducks);

    }
}
