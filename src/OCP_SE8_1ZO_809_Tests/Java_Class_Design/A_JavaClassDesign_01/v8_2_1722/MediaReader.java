package OCP_SE8_1ZO_809_Tests.Java_Class_Design.A_JavaClassDesign_01.v8_2_1722;

/**
 * Created by WSteinle on 28.03.2017.
 */
public class MediaReader implements Classic {
    int version = 2;

    @Override
    public void read() {
        System.out.println(Classic.version);
    }
}
