package ZertifizierungsProgramm.Test_Level5.v8_2_1276.v8_2_1198;

/**
 * Created by WSteinle on 07.02.2017.
 */
public class OrderManager extends CobraComponent {
    OrderManager() {}
    void startUp(String s) {
        ior = getIORFrumURL(s);
    }

    String getIORFrumURL(String s) {
        return "URL://" + s;
    }
}
