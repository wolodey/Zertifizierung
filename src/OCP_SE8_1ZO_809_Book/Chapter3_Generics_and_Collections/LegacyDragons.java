package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 28.02.2017.
 */
public class LegacyDragons {
    public static void main(String[] args) {
        List unicorns = new ArrayList();
        unicorns.add(new Unicorn());
        printDragons(unicorns);
    }

    private static void printDragons(List<Dragon> dragons) {
        for(Dragon dragon : dragons) {
            System.out.println(dragon);
        }
    }
}
