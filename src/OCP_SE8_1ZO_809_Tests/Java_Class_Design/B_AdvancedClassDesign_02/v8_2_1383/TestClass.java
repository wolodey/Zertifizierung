package OCP_SE8_1ZO_809_Tests.Java_Class_Design.B_AdvancedClassDesign_02.v8_2_1383;

/**
 * Created by WSteinle on 15.03.2017.
 */
class A {}
public class TestClass {
    public class A{
        public void m(){}
    }

    class B extends A {}

    public static void main(String[] args) {
        new TestClass().new A() {
            public void m() {}
        };

        new TestClass().new B() {};
    }
}
