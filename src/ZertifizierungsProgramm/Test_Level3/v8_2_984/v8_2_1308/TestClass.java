package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1308;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class TestClass {
    static int si = 10;

    public static void main(String[] args) {
        new TestClass();

      //  System.out.println(1 + 2 + "32);
        System.out.println(new TestClass().main);
    }
    int main;

    public TestClass() {
        System.out.println(this);
    }

    public String toString() {
        return "TestClass.si = " + this.si;
    }


}
