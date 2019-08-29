package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1016;

/**
 * Created by WSteinle on 10.02.2017.
 */
public class Count {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        do {
            if(count % 3 == 0) continue;
            sum+=count;
        } while (count++ < 11);

        System.out.println(sum);
    }
}
