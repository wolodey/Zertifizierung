package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 15.11.2017.
 */
public class Outer_TestAufgabe8 {
    private int x = 5;
    protected  class Inner {
        // тут ошибка public static int x = 10;
        public void go(){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Outer_TestAufgabe8 out = new Outer_TestAufgabe8();
        Outer_TestAufgabe8.Inner in = out.new Inner();
        in.go();
    }
}
