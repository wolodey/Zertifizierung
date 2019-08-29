package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1337;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class B extends A {
    int i = 4;

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
