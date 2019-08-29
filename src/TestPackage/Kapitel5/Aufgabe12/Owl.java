package TestPackage.Kapitel5.Aufgabe12;

/**
 * Created by WSteinle on 20.01.2017.
 */
public class Owl implements Nocturnal {
    public boolean isBlind() { return  false;}

    public static void main(String[] args) {
       // Nocturnal nocturnal = (Nocturnal) new Bird();
        Nocturnal nocturnal = (Nocturnal) new Owl();
        System.out.println(nocturnal.isBlind());
    }
}
