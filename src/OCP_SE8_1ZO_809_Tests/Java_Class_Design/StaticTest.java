package OCP_SE8_1ZO_809_Tests.Java_Class_Design;

import java.time.ZoneId;

/**
 * Created by WSteinle on 13.03.2017.
 */
public class StaticTest {
    static {
        System.out.println("in static");
    }
    {
        System.out.println("in non static");
    }

    public static void main(String[] args) {
        StaticTest str1;
        System.out.println("1");
        str1 = new StaticTest();
        System.out.println("2");
        StaticTest st2 = new StaticTest();

        System.out.println(ZoneId.systemDefault());
    }
}
