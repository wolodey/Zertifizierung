package ZertifizierungsProgramm.Working_with_methods.v8_2_1373.v8_2_1131;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class TestClass {
    static TestClass ref;
    String[] arguments;

    public static void main(String[] args) {
        ref = new TestClass();
        ref.func(args);
    }
    public void func(String[] args) {
        ref.arguments = args;
    }
}
