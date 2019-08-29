package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.method_references;


import OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.comparator.Duck;

import java.util.Comparator;

/**
 * Created by WSteinle on 06.03.2017.
 */
public class DuckHelper {

    public static int compareByWeight(Duck d1, Duck d2) {
        return d1.getWeight() - d2.getWeight();
    }

    public static int compareByName(Duck d1, Duck d2) {
        return d1.getName().compareTo(d2.getName());
    }

    Comparator<Duck> byWeight = (duck1, duck2) -> compareByWeight(duck1, duck2);

    Comparator<Duck> byWeightKurz = DuckHelper::compareByWeight;


    public static int meinComparator (Duck duck) {
        System.out.println(duck.getWeight() + 100);
        return duck.getWeight() + 100;
    }



    public static void main(String[] args) {
        MeinFunkInterface<Duck> meinFunkInterface = (lalala) -> meinComparator(lalala);
        System.out.println(meinFunkInterface);
      }

}
