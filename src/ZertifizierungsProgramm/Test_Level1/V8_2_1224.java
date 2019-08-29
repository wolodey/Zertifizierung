package ZertifizierungsProgramm.Test_Level1;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class V8_2_1224 {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if(i++ > --j) continue;
        } while (i < 5);
        System.out.println("i = " + i + " j = " + j);
    }
}
