package ZertifizierungsProgramm;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class TestClass3 {

    public void initDate(String[] arr) {
        int ind = 0;
        for(String str : arr) {
            str.concat(str+" "+ind);
            ind++;
        }
    }

    public void printDate(String[] arr) {
        for(String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        TestClass3 ot = new TestClass3();
        String[] arr = new String[2];
        ot.initDate(arr);
        ot.printDate(arr);


    }
}
