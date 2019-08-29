package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1215;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class B extends A {
    public void mA(){
        System.out.println("mA from B");
    }
    public void mB(){
        System.out.println("mB from B");
    }

    public static void main(String[] args) {

        new A().mA();
    }
}
