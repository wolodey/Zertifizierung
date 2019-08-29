package ZertifizierungsProgramm.Working_with_methods.v8_2_1373.v8_2_1092;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class Holder {
    int value = 1;
    Holder link;

    public Holder (int val) {this.value = val;}

    public static void main(String[] args) {
        final Holder a = new Holder(5);
        Holder b = new Holder(10);
        a.link = b;

        b.link = setIt(a,b);
        System.out.println(a.link.value + " " + b.link.value);
    }

    public static Holder setIt(final Holder x, final Holder y) {
        x.link = y.link;
        return x;
    }
}
