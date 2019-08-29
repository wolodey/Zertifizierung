package OCP_SE8_1ZO_809_Book.Chapter1_Advanced_Class_Design;

/**
 * Created by WSteinle on 21.02.2017.
 */
public enum OnlyOne {
    ONCE(true);
    private OnlyOne(boolean b) {
        System.out.println("constructing");
    }

    public static void main(String[] args) {
        OnlyOne firstCall = OnlyOne.ONCE;
        OnlyOne secondCall = OnlyOne.ONCE;

    }
}
