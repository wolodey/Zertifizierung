package TestPackage.Kapitel5.Aufgabe12.Polymorphism;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = (Bird)fish;

        Bird bird2 = new Bird();
        Fish fish2 = bird2;

    }
}
