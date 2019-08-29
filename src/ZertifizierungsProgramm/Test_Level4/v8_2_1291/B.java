package ZertifizierungsProgramm.Test_Level4.v8_2_1291;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class B extends A {
    int fi = 15;

    public static void main(String[] args) {
        B b = new B();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A)b).fi);

       // A aa = new B();
        //B bb = (B)new A();


    }
}
