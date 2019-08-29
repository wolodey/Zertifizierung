package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 15.11.2017.
 */
public class Outer_TestAufgabe9 {
    private int x = 24;

    private static int y = 10;
    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer_TestAufgabe9.this.x;
            private int y = Outer_TestAufgabe9.y;
            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer_TestAufgabe9().getX();
    }
}
