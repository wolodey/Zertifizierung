package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1395;

/**
 * Created by WSteinle on 06.02.2017.
 */
public class SimpleLoop {
    public static void main(String[] args) {
        int i = 0, j = 10;
        int count = 0;
        while (i < j) {
            i++;
            j--;
            count++;

        }
        System.out.println(i + " " + j + " " + count);
    }
}
