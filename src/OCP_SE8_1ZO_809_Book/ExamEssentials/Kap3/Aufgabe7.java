package OCP_SE8_1ZO_809_Book.ExamEssentials.Kap3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by WSteinle on 15.12.2017.
 */
public class Aufgabe7 {
    public static void main(String[] args) {
        Set<Number> numbers = new HashSet<>();
        numbers.add(new Integer(86));
        numbers.add(75);
        numbers.add(new Integer(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iterator = numbers.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }

}
