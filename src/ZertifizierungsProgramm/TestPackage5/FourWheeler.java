package ZertifizierungsProgramm.TestPackage5;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class FourWheeler implements Automobile {
    String name;
    @Override
    public String describe() {
        return " 4 Wheeler " + name;
    }
}
