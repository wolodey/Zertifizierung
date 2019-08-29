package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1083;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class LoopTest {
    public static void main(String[] args) {
        int ai[][] = {{1,2}, null};
       // int ab [] = {1, 2, null};

        int counter = 0;
        outer: for (int i = 0; i < 3; i++) {
            middle: for(int j = 0; j < 3; j++) {
                inner: for(int k = 0; k < 3; k++) {
                    if(k-j > 0) {
                        break middle;
                    }
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }

}
