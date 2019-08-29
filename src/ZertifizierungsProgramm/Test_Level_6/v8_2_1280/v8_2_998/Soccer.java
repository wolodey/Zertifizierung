package ZertifizierungsProgramm.Test_Level_6.v8_2_1280.v8_2_998;

/**
 * Created by WSteinle on 08.02.2017.
 */
public class Soccer extends Game {
    public static void play() {
        System.out.println("Playing Soccer...");
    }
    static int abc = 10;

    public static void main(String[] args){// throws Exception {
       // Game g = new Soccer();
        //g.play();
        Soccer s = new Soccer();
        s.play();
        System.out.println(s.abc);
       // System.out.println(g.abc);
    }
}
