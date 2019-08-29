package TestPackage.Kapitel5.Aufgabe12.Aufgabe16;

/**
 * Created by WSteinle on 24.01.2017.
 */
abstract class Reptile {
    public final void layEggs() {
        System.out.println("Reptile laying eggs");
    }

    public static void main(String[] args) {
        Reptile reptile = new Lizard();
        reptile.layEggs();
    }

}
