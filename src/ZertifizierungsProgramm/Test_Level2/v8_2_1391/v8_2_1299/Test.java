package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1299;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        int var = 20, i = 0;

        do {
            while (true) {
                if ( i++ > var) break;
            }

        }while (i < var--);
        System.out.println(var);
    }
}
