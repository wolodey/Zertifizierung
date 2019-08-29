package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_1032;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class BreakTest {
    public static void main(String[] args) {
        int i = 0, j = 5;
        lab1: for(;; i++) {
            for(; ; --j) {
                if(i > j) break lab1;
            }
        }
        System.out.println(i + " " + j);
    }
}
