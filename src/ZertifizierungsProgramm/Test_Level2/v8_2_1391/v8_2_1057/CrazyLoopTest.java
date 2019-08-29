package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1057;

/**
 * Created by WSteinle on 31.01.2017.
 */
public class CrazyLoopTest {
    static void crazyLoop() {
        int c = 0;
        JACK: while (c < 8) {
            JILL: System.out.println(c);
           // if(c > 3) break JILL; else c++; //--- JILL hier out of the scope
        }
    }
    public static void main(String[] args) {
        int index = 1;
        int [] intArr = new int[5];
        int myInt = intArr[index];
        System.out.println(myInt);

        double[] doubleArr = new double[5];
        double myDouble = doubleArr[index];
        System.out.println(myDouble);

    }
}
