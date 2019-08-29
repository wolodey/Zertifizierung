package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1042;

/**
 * Created by WSteinle on 30.01.2017.
 */
public class MethodTest {
    public void method1(int i) {
        int j = (i*30 - 2) / 100;

        POINT : for(;j<10; j++) {
            boolean flag = false;
            while (!flag) {
                if(Math.random()>0.5) break POINT;
            }
        }

        while(j>0) {
            System.out.println(j--);
           // if(j==4) break POINT;
        }
    }
}
