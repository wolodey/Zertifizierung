package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_1294;

/**
 * Created by WSteinle on 07.02.2017.
 */
public class TestClass {
    static Wrapper changeWrapper(Wrapper w) {
        w = new Wrapper();
        w.w += 9;
        return w;
    }

    public static void main(String[] args) {
        Wrapper w = new Wrapper();
        w.w = 20;
        changeWrapper(w);
        w.w += 30;
        System.out.println(w.w);
        w = changeWrapper(w);
        System.out.println(w.w);
    }
}
