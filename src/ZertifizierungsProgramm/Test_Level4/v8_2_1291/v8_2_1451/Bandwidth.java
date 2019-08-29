package ZertifizierungsProgramm.Test_Level4.v8_2_1291.v8_2_1451;

/**
 * Created by WSteinle on 03.02.2017.
 */
public class Bandwidth {
    public int available = 0;
    public int getAvailable() {
        return available;
    }

    public Bandwidth(int quota) {
        this.available = quota;
    }

    public void addMore(int more) {
        available += more;
    }
}
