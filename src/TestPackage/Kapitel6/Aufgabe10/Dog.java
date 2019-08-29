package TestPackage.Kapitel6.Aufgabe10;

/**
 * Created by WSteinle on 24.01.2017.
 */
public class Dog {
    public String name;
    public void parseName() {
        System.out.print("1");
        try {
            System.out.print("2");
            int x = Integer.parseInt(name);
            System.out.print("3");
        } catch (NumberFormatException e) {
            System.out.print("4");
        }
    }

    public static void main(String[] args) {
        Dog leroy = new Dog();
        leroy.name = "Leroy";
        leroy.parseName();
        System.out.print(5);

        String name = "alex";
        int x = Integer.parseInt(name);
    }
}
