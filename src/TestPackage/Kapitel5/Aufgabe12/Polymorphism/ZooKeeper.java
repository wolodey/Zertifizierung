package TestPackage.Kapitel5.Aufgabe12.Polymorphism;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class ZooKeeper {
    public static void main(String[] args) {
        Animal animal = new Gorilla();
        Animal animal2 = new Animal();
        System.out.println(animal.getName());
        System.out.println(animal2.getName());
    }
}
