package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1270;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class TestClass {

    public static void main(String[] args) {
        boolean b = false;
        int i = 1;

        do{
            i++;
        } while (b = !b);

        System.out.println(i);

        int a [] = new int[10];

        int aa = 1, bb = 0, cc = 1;
        System.out.println(bb = cc);
        System.out.println(bb);
        System.out.println(b);
    }
}
