package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1399;

/**
 * Created by WSteinle on 30.01.2017.
 */
import java.util.*;
public class ClassnameTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.getClass());


        Integer i = new Integer (42);
        Long ln = new Long(42);
        Double d = new Double(42.0);


        System.out.println(i.equals(d));
        System.out.println(d.equals(ln));
        System.out.println(ln.equals(42));
        System.out.println(ln);
      ;
    }

}
