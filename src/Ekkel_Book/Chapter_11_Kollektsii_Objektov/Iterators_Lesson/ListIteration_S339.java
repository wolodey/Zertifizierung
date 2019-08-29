package Ekkel_Book.Chapter_11_Kollektsii_Objektov.Iterators_Lesson;

import Ekkel_Book.pets.Pet;
import Ekkel_Book.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class ListIteration_S339 {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ListIterator<Pet> iterator = pets.listIterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", " + iterator.nextIndex() +
                    ", " + iterator.previousIndex() + "; ");
        }

        System.out.println();

        // В обратном направлении
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous().id() + " ");
        }
        System.out.println();
        System.out.print(pets);
        iterator = pets.listIterator(3);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(Pets.randomPet());
        }
        System.out.println(pets);

    }
}
