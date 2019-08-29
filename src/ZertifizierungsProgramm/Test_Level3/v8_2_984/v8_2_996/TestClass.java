package ZertifizierungsProgramm.Test_Level3.v8_2_984.v8_2_996;

/**
 * Created by WSteinle on 01.02.2017.
 */
public class TestClass {
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();
        g.play();
        g.play("df");

      //  g.play("sdf");

        Soccer s = (Soccer) g;
        s.play();
        s.play("ba");


    }
}
