package TestPackage.Kapitel4;
import TestPackage.*;

import static TestPackage.Rope.*;
/**
 * Created by WSteinle on 18.01.2017.
 *
 * Aufgabe 12
 */
public class RopeSwing {
   static Rope rope1  = new Rope();
   static Rope rope2 = new Rope();
    {
        System.out.println(rope1.length);
    }

    public static void main (String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
    }
}
