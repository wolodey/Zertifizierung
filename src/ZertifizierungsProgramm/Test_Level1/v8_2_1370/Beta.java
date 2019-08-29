package ZertifizierungsProgramm.Test_Level1.v8_2_1370;

/**
 * Created by WSteinle on 26.01.2017.
 */
public class Beta extends Baap {
    public int h = 44;
    public int a = 33;
    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println(b.h + " " + b.getH());

        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());




    }
}
