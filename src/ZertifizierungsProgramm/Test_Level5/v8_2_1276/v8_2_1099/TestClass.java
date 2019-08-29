package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1099;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class TestClass {
    public static void main(String[] args) {
        int x = 0;
        labelA: for(int i=10; i<0; i--) {
            int j = 0;
            labelB: while (j < 10) {
                if(j>i) break labelB;
                if(i == j) {
                    x++;
                    continue labelA;
                }
                j++;
            }
            x--;
        }
        System.out.println(x);
    }
}
