package ZertifizierungsProgramm.Test_Level_6.v8_2_1280;

/**
 * Created by WSteinle on 07.02.2017.
 */
public class TestClass {
    public void loopTest(int x) {
        loop: for(int i = 1; i<5; i++) {
            for(int j = 1; j < 5; j++) {
                System.out.println(i);
                if(x == 0) { continue loop;}
                System.out.println(j);
            }
        }
    }
}
