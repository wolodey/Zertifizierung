package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1493.p2;

import OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1493.p1.A;

/**
 * Created by WSteinle on 29.03.2017.
 */
public class B extends A {
    public void process(A a) {
        a.i = a.i*2;
    }

    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        b.process(a);
        System.out.println(a.getI());
    }
}
