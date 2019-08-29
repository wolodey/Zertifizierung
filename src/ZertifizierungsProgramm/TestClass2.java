package ZertifizierungsProgramm;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class TestClass2 {

    public static void main(String[] args) {
        int i;
        int j;
        for(i=0, j=0; j< i; ++j, i++) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + " " + j);


        Integer i1 = 1;
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;

        System.out.println(i1==i2);
        System.out.println(i1 == i3);
        //System.out.println(i1 == b1);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));


        int ia = 123456789;
        float fa = ia;
        System.out.println((int)fa);


        int [] arr = new int[0];


    }
}
