package TestPackage.Kapitel5.Aufgabe12.Aufgabe20;

/**
 * Created by WSteinle on 03.02.2017.
 */
public abstract class Bird {
    private void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Pelican();
        bird.fly();
    }


}
