package ZertifizierungsProgramm.Test_Level1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class ListTest {
    public static void main(String[] args) {
        List s1 = new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        System.out.println(s1);

        List s2 = new ArrayList(s1.subList(1, 1));
        s1.addAll(s2);
        System.out.println(s2);
        System.out.println(s1);
    }
}
