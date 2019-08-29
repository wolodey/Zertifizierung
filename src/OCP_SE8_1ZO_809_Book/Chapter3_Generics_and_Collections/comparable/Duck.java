package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by WSteinle on 03.03.2017.
 */
public class Duck implements Comparable <Duck> {
    private String name;
    public Duck(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck("Mama"));
        ducks.add(new Duck("Alexa"));
        Collections.sort(ducks);
        System.out.println(ducks);
    }
}
