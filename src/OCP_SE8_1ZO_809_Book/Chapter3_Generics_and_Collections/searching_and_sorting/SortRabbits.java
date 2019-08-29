package OCP_SE8_1ZO_809_Book.Chapter3_Generics_and_Collections.searching_and_sorting;


import java.util.*;

/**
 * Created by WSteinle on 06.03.2017.
 */
public class SortRabbits {
    static class Rabbit { int id;}

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());

        Comparator<Rabbit> c = (rabbit1, rabbit2) -> rabbit1.id - rabbit2.id;

        Collections.sort(rabbits, c);

        List<String> names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> comparator = Comparator.reverseOrder();
        int index = Collections.binarySearch(names, "Hoppy", comparator);
        System.out.println(index);


    }
}
