package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1096;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestWrapper {
    public static void main(String[] args) {
        Integer i = Integer.parseInt("-128");
        Integer j = i;
        i --;
        i ++;
        System.out.println((i == j));
    }
}
