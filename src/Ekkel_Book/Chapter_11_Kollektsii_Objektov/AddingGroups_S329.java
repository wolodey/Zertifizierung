package Ekkel_Book.Chapter_11_Kollektsii_Objektov;

import java.util.*;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class AddingGroups_S329 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        //Cоздает список на основе массива
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        list.set(1, 99);
        //list.add(21);

    }
}
