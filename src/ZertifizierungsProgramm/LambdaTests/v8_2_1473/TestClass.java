package ZertifizierungsProgramm.LambdaTests.v8_2_1473;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by WSteinle on 09.02.2017.
 */
public class TestClass {

    static int k = 0;
    static {
         k = 10/ k;
    }
    public static boolean checkList(List list, Predicate<List> p) {
        return p.test(list);
    }

    public static void main(String[] args) {
        boolean b = checkList(new ArrayList(), (List qq) -> qq.isEmpty());
        System.out.println(b);

        int a = Integer.MIN_VALUE;
        int bb = -a;
        System.out.println(a+" "+ bb);

        int i = 23423;
        float f = i;


        char charv= 10;
        int intv = charv;
        byte Bbb = 10;
        short as = Bbb;

    }
}
