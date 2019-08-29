package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1824;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class PlaceHolder<K, V> {
    private K k;
    private V v;

    public PlaceHolder(K k, V v) {
        this.k = k;
        this.v = v;
    }
    public K getK() {
        return k;
    }

    public static <X> PlaceHolder<X, X> getDuplicateHolder(X x) {
        return new PlaceHolder<X, X>(x, x);
    }

}
