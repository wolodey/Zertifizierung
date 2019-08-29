package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1451;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class AnocherClass {
    public static void main(String[] args) {
        Bandwidth bw = new Bandwidth(100);
        bw.addMore(-bw.getAvailable());
        System.out.println(bw.available);
    }
}
