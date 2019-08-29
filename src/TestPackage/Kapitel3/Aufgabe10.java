package TestPackage.Kapitel3;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class Aufgabe10 {
    public static void main(String[] args) {
        String hello = "hello";
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a);
        System.out.println(a == "");
        if(a == "2cfalse") System.out.println("==");
        if(a.equals("2cfalse")) System.out.println("equals");
        int [] ar = new int[2];
        int am = ar[3];
        int [][] mar = new int[2][];
    }
}
