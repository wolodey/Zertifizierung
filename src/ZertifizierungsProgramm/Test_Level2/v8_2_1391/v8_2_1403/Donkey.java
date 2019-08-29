package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1403;

/**
 * Created by WSteinle on 31.01.2017.
 */
public class Donkey implements Movable {
    int location = 200;
    @Override
    public void move(int by) {
        location = location + by;
    }

    @Override
    public void moveBack(int by) {
        location = location - by;
    }
}
