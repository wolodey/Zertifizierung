package TestPackage.Kapitel5.Aufgabe12.Aufgabe17;

/**
 * Created by WSteinle on 24.01.2017.
 */
public abstract class Whale {
    public abstract void dive();

    public static void main(String[] args) {
        Whale whale = new Orca();
        whale.dive();
    }
}
