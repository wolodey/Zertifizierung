package TestPackage.Kapitel5.Aufgabe12;

/**
 * Created by WSteinle on 20.01.2017.
 */
public class Bird implements Nocturnal{
    public boolean isBlind() {
        System.out.println("eeee");
        return  true;
    }

    public static void main(String[] args) {
           // Nocturnal nocturnal = (Nocturnal) new Bird();
            Nocturnal nocturnal = (Nocturnal) new Owl();
            System.out.println(nocturnal.isBlind());
        Nocturnal sowa = nocturnal;
        System.out.println(sowa.isBlind());
        }

}
