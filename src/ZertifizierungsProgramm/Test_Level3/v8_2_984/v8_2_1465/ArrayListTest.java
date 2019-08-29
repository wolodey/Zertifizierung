package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1465;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WSteinle on 01.02.2017.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List s1 = new ArrayList();
        try {
            while(true) {
                s1.add("sdfa");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(s1.size());

        String sss = "Abab";

    }
}
