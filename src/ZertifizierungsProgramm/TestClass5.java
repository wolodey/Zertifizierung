package ZertifizierungsProgramm;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class TestClass5 {
    public static void main(String[] args) throws Exception {
        String[] sa = {"a", "b", "c"};
        for(String s : sa) {
            if("b".equals(s)) continue;
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s+" again");
        }
    }
}
