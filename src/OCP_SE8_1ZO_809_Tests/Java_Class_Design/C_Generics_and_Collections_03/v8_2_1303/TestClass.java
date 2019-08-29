package OCP_SE8_1ZO_809_Tests.Java_Class_Design.C_Generics_and_Collections_03.v8_2_1303;

import java.util.Arrays;

/**
 * Created by WSteinle on 15.03.2017.
 */
public class TestClass {
    static String[] sa = {"a", "aa", "aaa", "aaaa"};

    static{
        Arrays.sort(sa);
    }

    public static void main(String[] args) {
        String search = "";
        if(args.length != 0) search = args[0];
        System.out.println(Arrays.binarySearch(sa, search));
    }
}
