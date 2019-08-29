package ZertifizierungsProgramm.Test_Level1.v8_2_920;

import java.util.Objects;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class NewClass {
    private Object o;
    void doSomething(Object s ) {
        o = s;
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
