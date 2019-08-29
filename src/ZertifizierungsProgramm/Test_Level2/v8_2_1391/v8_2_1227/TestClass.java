package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1227;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        int k = 0;
        int m = 0;
        for(int i = 0; i <= 3; i++) {
            k++;
            if(i==2) {
                i = 4;
            }
            m++;
        }

        System.out.println(k + " " + m);
    }
}
