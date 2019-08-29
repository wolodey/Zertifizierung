package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1334;

/**
 * Created by WSteinle on 29.03.2017.
 */
public class B extends A {
    int i = Math.round(3.5f);

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    public void print() {
        System.out.println(i);
    }

}

