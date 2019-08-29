package ZertifizierungsProgramm;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class TestClass9 {

    public static void main(String[] args) {
        int a = 5, b = 7, k = 0;
        Integer m = null;
        k = new Integer (a) + new Integer (b);
        System.out.println(k);

        k = new Integer(a) + b;
        System.out.println(k);

        k = b + new Integer(a);
        System.out.println(k);

        m = new Integer(a) + new Integer(b);
        System.out.println(m);

        Short kk = 9;
        System.out.println(kk.shortValue());

        Integer abc = 9;

        char cc = 'a';
        cc = 9;
        String str = "aaa";
        Boolean bb = false;
        System.out.println(str+bb);


        int xxxx = Integer.MIN_VALUE;
        System.out.println(Integer.toBinaryString(xxxx));


    }

}
