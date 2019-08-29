package TestPackage.Kapitel4;

import java.util.function.Predicate;

/**
 * Created by WSteinle on 18.01.2017.
 */
public class Aufgabe26 {
 

    public int age;

    public static void main(String[] args) {
        Aufgabe26 p1 = new Aufgabe26();
        p1.age = 1;
        check(p1, p -> p.age < 5);

}
    private static void check(Aufgabe26 panda, Predicate<Aufgabe26> pred) {
        String result = pred.test(panda)? "match" : "not match";
        System.out.println(result);
    }



}
