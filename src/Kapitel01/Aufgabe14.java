package Kapitel01;

import java.util.ArrayList;

public class Aufgabe14 {
    static class Chipmunk {}

    public static void main(String[] args) {
        Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r = new Thread();
        int result = 0;

        if(c instanceof Chipmunk) result += 1;
       // if(l instanceof Chipmunk) result += 2;
        if(r instanceof Chipmunk) result += 4;

        System.out.println(result);
    }
}
