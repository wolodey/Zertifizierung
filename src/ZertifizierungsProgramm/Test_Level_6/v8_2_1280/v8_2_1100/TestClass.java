package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_1100;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestClass {

   /* void probe (int x ) {
        System.out.println("In int");
    }*/
   /*void probe (Integer x) {
        System.out.println("In Integer");
    }*/
   /* void probe(long x) {
        System.out.println("In long");
    }*/
    void probe(Long x) {
        System.out.println("In LONG");
    }
    /*void probe (float x) {
        System.out.println("In float");
    }*/
    /*void probe (Float x) {
        System.out.println("In FLOAT");
    }*/
    /*void probe (double x) {
        System.out.println("In double");
    }*/
   /* void probe (Double x) {
        System.out.println("In DOUBlE");
    }*/
    void probe(int ...x) {
        System.out.println("In ...");
    }

    void probe (Object x) {
        System.out.println("In Object");
    }
    void probe (Number x) {
        System.out.println("In Number only Double");
    }

    public static void main(String[] args) {
        Integer a = 4;
        //Integer a = new Integer(4);
        //int a = 3;
        //new TestClass().probe(a);
        int x = 12;
        new TestClass().probe((float)x);
    }
}
