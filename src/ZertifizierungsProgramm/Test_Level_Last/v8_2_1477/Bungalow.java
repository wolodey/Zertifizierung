package ZertifizierungsProgramm.Test_Level_Last.v8_2_1477;

/**
 * Created by WSteinle on 08.02.2017.
 */
public interface Bungalow extends House {
    public default String getAddress() {
        return "101 Smart Str Bungalow method";
    }
}
