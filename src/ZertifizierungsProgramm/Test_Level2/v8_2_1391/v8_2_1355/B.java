package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1355;

/**
 * Created by WSteinle on 01.02.2017.
 */
public class B extends A {
    int j;
    public B(int x, int y) {
        super(x);
        this.j = y;
    }

    B(int z) {
        this(z, z);
    }

    public static void main(String[] args) {
        B bbb = new B(10);

    }
}
