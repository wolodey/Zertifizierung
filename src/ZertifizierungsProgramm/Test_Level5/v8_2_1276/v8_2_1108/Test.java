package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1108;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class Test {
    public static void main(String[] args) {
        int k = 9, s = 5;
        switch (k) {
            default:
                if(k == 10) {
                    s = s * 2;
                } else {
                    s = s + 4;
                    break;
                }
            case 7: s = s+ 3;
        }
        System.out.println(s);
    }

}
