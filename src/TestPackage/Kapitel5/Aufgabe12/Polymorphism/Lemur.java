package TestPackage.Kapitel5.Aufgabe12.Polymorphism;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Lemur extends Primate implements HasTail {

    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Lemur lemur2 = (Lemur) hasTail;


        System.out.println("Hwost " + hasTail.hwost);


        Primate primate = lemur;
        System.out.println(primate.hasHair());

        Object lemurAsObject = lemur;



    }
}
