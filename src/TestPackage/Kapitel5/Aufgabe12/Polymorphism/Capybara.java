package TestPackage.Kapitel5.Aufgabe12.Polymorphism;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Capybara extends Rodent {

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara) rodent;
    }
}
