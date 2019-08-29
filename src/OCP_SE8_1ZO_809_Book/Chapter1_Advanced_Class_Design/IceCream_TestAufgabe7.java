package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 15.11.2017.
 */
public class IceCream_TestAufgabe7 {
    enum Flavors {
        VANILLA, CHOCOLATE, STR
    }

    public static void main(String[] args) {
        Flavors f = Flavors.STR;
        switch (f.ordinal()) {
            case 0 :
                System.out.println("vanilla");
            case 1:
                System.out.println("Choco");
            case 2:
                System.out.println("Str");
                break;
            default:
                System.out.println("missing");

        }
    }
}
