package Ekkel_Book.Chapter_11_Kollektsii_Objektov.Iterators_Lesson;

import Ekkel_Book.pets.Pet;
import Ekkel_Book.pets.Pets;

import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class SimpleIteration_S337 {
    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(12);
        Iterator<Pet> iterator = pets.iterator();

        while (iterator.hasNext()) {
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();

        //Более простой синтакт (там где возможно)
        for (Pet pet : pets) {
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();

        //Итератор также позволяет удалять элементы
        iterator = pets.iterator();
        for(int i=0; i<6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);

    }
}
