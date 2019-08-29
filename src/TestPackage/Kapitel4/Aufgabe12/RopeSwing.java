package TestPackage.Kapitel4.Aufgabe12;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class RopeSwing {

    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);

        int intVal = 20;
        long longVal = intVal * (long) intVal;
        System.out.println(longVal);
    }



}
