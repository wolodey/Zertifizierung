package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477.v8_2_1024;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class TestFor {
    public static void main(String[] args) {

        outer: for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                if(i == j){
                    continue outer;
                }
                System.out.println("i = " + i + ", j = " + j);
            }

        }

    }
}
