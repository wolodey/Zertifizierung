package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1198;

/**
 * Created by WSteinle on 07.02.2017.
 */
public class CobraComponent {
    String ior;
    CobraComponent() {
        startUp("IOR");
    }
    void startUp(String s) {
        ior = s;
    }
    void print() {
        System.out.println(ior);
    }
}
