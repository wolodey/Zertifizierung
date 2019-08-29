package ZertifizierungsProgramm.Test_Level2.v8_2_1391.v8_2_1173;

/**
 * Created by WSteinle on 27.01.2017.
 */
public class Test {
    public static void main(String[] args) {
        args[0] = "closed";
        if(args[0].equals("open")) {
            if(args[1].equals("someone")) {
                System.out.println("Hello");
            } else {
                System.out.println("Go away " + args[1]);
            }
        }

    }


}
