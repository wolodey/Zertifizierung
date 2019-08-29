package ZertifizierungsProgramm.Test_Level1.v8_2_1409;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class Test {
    public static void testInts(Integer obj, int var) {
        obj = var++;
        obj ++;
    }

    public static int out1() { return 1;}
    public static int out2() { return 2;}
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);
        //val1 ++ === new Integer(obj.intValue() + 1)
        System.out.println(val1 + " " + val2);

        String str = "-0,50";
        System.out.println(str.length());

        String str1 = "one";
        String str2 = "two";
        System.out.println(str1.equals(str1=str2));

        int i = args.length-1;
        System.out.println(i);

        int ii = 10;
        System.out.println(ii<20 ? out1() : out2() );
    }
}
