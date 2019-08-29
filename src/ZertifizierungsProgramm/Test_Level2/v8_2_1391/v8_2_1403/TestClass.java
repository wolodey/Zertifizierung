package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1403;

/**
 * Created by WSteinle on 31.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        Movable m = new Donkey();
        m.move(10);
        m.moveBack(20);
        Donkey don = new Donkey();
        System.out.println(m.location);
        System.out.println(don.location);
    }
}
