package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1233;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            while(flag) {
                c++;
                if(i>c || c>5) flag = false;
            }
        }
        System.out.println(c);
    }
}
