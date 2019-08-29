package OCP_SE8_1ZO_809_Tests.Java_Class_Design.B_AdvancedClassDesign_02.v8_2_1466;

/**
 * Created by WSteinle on 22.08.2019.
 */
public class Klasse_B extends Klasse_A {
    char c = 'a';
    Klasse_B() {
        super('b');
    }

    class Klasse_C extends Klasse_A {
        char c = 'c';
        Klasse_C() {
            super('d');
            System.out.println(Klasse_B.this.c);
            System.out.println(Klasse_C.this.c);
        }
    }
}
