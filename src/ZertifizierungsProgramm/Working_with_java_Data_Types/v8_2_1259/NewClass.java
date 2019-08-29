package ZertifizierungsProgramm.Working_with_java_Data_Types.v8_2_1259;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class NewClass {
    private Object o;
    void doSomething (Object s) {
        o=s;
    }

    public static void main(String[] args) {
        Object obj = new Object();
        NewClass tc = new NewClass();
        tc.doSomething(obj);
        obj = new Object();
        obj = null;
        tc.doSomething(obj);
    }
}
