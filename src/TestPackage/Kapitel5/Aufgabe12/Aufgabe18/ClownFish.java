package TestPackage.Kapitel5.Aufgabe12.Aufgabe18;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class ClownFish implements Aquatic {
    public String getNumberOfGills() { return "4";}
    //public int getNumberOfGills(int a) { return 45;}

    public static void main(String[] args) {
        Aquatic aquatic = new ClownFish();

        System.out.println(aquatic.getNumberOfGills(3));

        System.out.println(new ClownFish().getNumberOfGills(-1));

    }

}
