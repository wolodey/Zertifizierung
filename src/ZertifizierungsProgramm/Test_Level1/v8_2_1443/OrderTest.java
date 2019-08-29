package ZertifizierungsProgramm.Test_Level1.v8_2_1443;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class OrderTest {
    public void initDate(String[] arr) {
        int ind = 0;
        for(String str : arr) {
            str.concat(str + " " + ind);
            ind ++;
        }
    }

    public void printData(String[] arr) {
        for(String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        String[] arr = new String[2];
        ot.initDate(arr);
        ot.printData(arr);
    }
}
