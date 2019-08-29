package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_960;

/**
 * Created by WSteinle on 10.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int c = 0;
        A: for(int i = 0; i < 2; i++) {
            B: for(int j = 0; j < 2; j++) {
                C: for(int k = 0; k < 3; k++) {
                    c++;
                    if(k>j) break ;
                }
            }
        }
        System.out.println(c);
    }
}
