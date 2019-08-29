package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_855;

/**
 * Created by WSteinle on 02.02.2017.
 */
public class LoadTest {
    public static void main(String[] args) throws Exception {
        LoadTest t = new LoadTest();
        double res = t.getLoad();
        System.out.println(res);

        for (int k = 5; k < 7;) {
            k = getLoad();
            System.out.println(k);
        }
    }

    public static int getLoad() {
        return 8;
    }

   // public double getLoad(){
     //   return 3.0;
    //}

}
