package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1464;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class LoopTest {
    int k = 5;
    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;
    }

    public void printThem() {
        while(checkIt(k)) {
            System.out.println(k--);
        }
    }

    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}
