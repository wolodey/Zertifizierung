package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1182;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestClass {
    public void testRefs(String str, StringBuilder sb){
        str = str + sb.toString();
        sb.append(str);
        str = null;
        sb = null;
    }

    public static void main(String[] args) {
        String s = "aaa";
        StringBuilder sb = new StringBuilder("bbb");
        new TestClass().testRefs(s, sb);
        System.out.println("s = " + s+ " sb = " + sb);
    }
}
