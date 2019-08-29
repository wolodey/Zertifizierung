package OCP_SE8_1ZO_809_Book.Chapter7_Concurrency.CopyOnWriteCollectionsLesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

/**
 * Created by WSteinle on 29.03.2017.
 */
public class TestCopyOnWriteArrayList {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52, 45));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 5, 3, 8));
        for (Integer item : list) {
            System.out.print(item + " ");
            list.add(9);
        }
        System.out.println();

        for (Integer item2 : list) {
            System.out.print(item2 + " ");
           // list2.add(11);
        }

        System.out.println();
        System.out.println("Size " + list.size());
        System.out.println("Size2 " + list2.size());

    }
}
