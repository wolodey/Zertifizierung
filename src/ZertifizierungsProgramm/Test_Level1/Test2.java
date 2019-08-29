package ZertifizierungsProgramm.Test_Level1;

/**
 * Created by WSteinle on 25.01.2017.
 */
public class Test2 {
    public static int[] getArray() { return null; }

    public static void main(String[] args) {
        int index = 1;
        try{
            getArray() [index = 2]++;
        } catch (Exception e) {}

        System.out.println("index = " + index);
    }
}
