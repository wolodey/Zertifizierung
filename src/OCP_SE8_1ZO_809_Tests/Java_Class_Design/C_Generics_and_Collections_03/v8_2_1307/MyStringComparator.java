package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1307;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by WSteinle on 31.03.2017.
 */
public class MyStringComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int s1 = ((String) o1).length();
        int s2 = ((String) o2).length();
        return s1 - s2;
    }


    static String[] sa = {"d", "bbb", "aaaa"};

    public static void main(String[] args) {
        Arrays.binarySearch(sa, "c", new MyStringComparator());
        System.out.println(Arrays.binarySearch(sa, "c", new MyStringComparator()));
    }
}
