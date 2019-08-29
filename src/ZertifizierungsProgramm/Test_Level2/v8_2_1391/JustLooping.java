package ZertifizierungsProgramm.Test_Level2.v8_2_1391;

/**
 * Created by WSteinle on 27.01.2017.
 */
public class JustLooping {
    private int j;
    void showJ() {
        while(j<=5) {
            for(int j=1; j <=5; ) {
                System.out.println(j+ " ");
                j++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        new JustLooping().showJ();
    }
}

class Waldemar {

}

abstract class Alex {}
