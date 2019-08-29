package TestPackage.Kapitel5.Aufgabe12.Aufgabe2;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Platupus extends Mammal{
    public Platupus() {
        super(4);
        System.out.println("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
       // new Platupus();
    }
}
