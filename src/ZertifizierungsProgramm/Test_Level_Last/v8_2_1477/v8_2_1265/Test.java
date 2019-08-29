package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1265;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int i = 0 , j = 0;
        X1: for(i = 0; i < 3; i= i +2) {
            X2: for(j = 3; j> 0; j--) {
                if(i <j) continue X1;
                else break X2;
            }
        }
        System.out.println(i+ " "+j);
    }
}
